package ma.emsi.patientmvc.web;

import lombok.AllArgsConstructor;
import ma.emsi.patientmvc.entities.Patient;
import ma.emsi.patientmvc.repositories.PatientRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
    private PatientRepository patientRepository;
    @GetMapping(path ="/user/index")
    public String patients(@NotNull Model model,
                           @RequestParam(name="page" ,defaultValue = "0") int page,
                           @RequestParam(name = "size", defaultValue = "5") int size,
                           @RequestParam(name = "Keyword", defaultValue = "") String Keyword
                            ){
        Page<Patient> pagePatients=patientRepository.findByNomContains(Keyword,PageRequest.of(page,size));
        model.addAttribute("listPatients",pagePatients.getContent());
        model.addAttribute("pages",new int[pagePatients.getTotalPages()]);
        model.addAttribute("currentPage",page);
        model.addAttribute("Keyword",Keyword);
        return "patients";
    }

    @GetMapping("/admin/delete")
    public String delete(Long id,String Keyword,int page){
        patientRepository.deleteById(id);
        return "redirect:/user/index?page="+page+"&Keyword="+Keyword;
    }
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/user/patients")
    @ResponseBody
    public List<Patient> listPatients(){
        return patientRepository.findAll();
    }

    @GetMapping("/admin/formPatients")
    public String formPatients(Model model){
        model.addAttribute("patient",new Patient());
        return "formPatients";
    }

    @PostMapping(path="/admin/save")
    public String save(Model model, @Valid Patient patient,
                       BindingResult bindingResult,
                       @RequestParam(defaultValue="0") int page,
                       @RequestParam(defaultValue = "") String Keyword){
             if(bindingResult.hasErrors()) return "formPatients";
             patientRepository.save(patient);
              return "redirect:/user/index?page"+page+"&Keyword="+Keyword;
    }

    @GetMapping("/admin/editPatient")
    public String editPatient(Model model, Long id, String Keyword, int page){
        Patient patient=patientRepository.findById(id).orElse(null);
        if(patient==null) throw new RuntimeException("Patient introuvable");
        model.addAttribute("patient",patient);
        model.addAttribute("page",page);
        model.addAttribute("Keyword",Keyword);
        return "editPatient";
    }
}
