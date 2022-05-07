# Patient-mvc
![image](https://user-images.githubusercontent.com/104327012/167253273-a6aa8e5a-db9e-47b7-a45a-b1f7dc43a63c.png)
![image](https://user-images.githubusercontent.com/104327012/167253359-36d8ac69-0e81-4362-94e4-18faad52b9c2.png)


    •	Partie 1 : Rechercher les patients, pagination et suppression des patients

    •	Partie 2 : Page template, Ajout des patients, validation des formulaires, édition et mise à jour des patients

    •	Partie 3 : Spring Security (Stratégies : InMemoryAuthentication et JDBCAuthentication)

    •	Partie 4 : Spring Security (Stratégie : UserDetailsService)

    •	Partie 1 : Rechercher les patients, pagination et suppression des patients


          La recherche des patients
![image](https://user-images.githubusercontent.com/104327012/167253329-c0689f80-b4b1-4a14-a7ef-d5beb26923b2.png)
         
         La suppression des patients
![image](https://user-images.githubusercontent.com/104327012/167253535-a9a7f140-4b0e-470c-9cdd-ada32784063c.png)

         Le message de confirmation de la suppression
![image](https://user-images.githubusercontent.com/104327012/167253555-815cdf92-13f7-4d20-a182-c79dfd08c9d2.png)
 
         La pagination des patients
![image](https://user-images.githubusercontent.com/104327012/167253580-9c394713-a6f4-4d68-8dd7-649dcc6ff76f.png)

     •	Partie 2 : Page template, Ajout des patients, validation des formulaires, édition et mise à jour des patients

            L’ajoute des patients
![image](https://user-images.githubusercontent.com/104327012/167253599-dec6a491-c8f5-4cb6-ae44-b784a1c463e7.png)

     Le formulaire d’ajoute des patients 
![image](https://user-images.githubusercontent.com/104327012/167253636-2ae41fec-dbdf-4560-83b5-2844b04dd5bd.png)

      La validation des formulaires
![image](https://user-images.githubusercontent.com/104327012/167253663-de010506-929d-4728-afef-26e6f1a98a88.png)
     
      édition et mise à jour des patients
      Le formulaire de modification
![image](https://user-images.githubusercontent.com/104327012/167254017-8266c1b0-d87e-4d86-878c-8e1ec63f7ee7.png)
   
      •	Partie 3 : Spring Security (Stratégies : InMemoryAuthentication et JDBCAuthentication)
            
          Spring Security
        Sign in
![image](https://user-images.githubusercontent.com/104327012/167254037-e28894e5-7529-48b0-b667-a2e7a6919ac3.png)
       
        Log out
![image](https://user-images.githubusercontent.com/104327012/167254063-8e0821e5-6b9c-4e51-a82e-d6c07b6fb55c.png)
      
      InMemoryAuthentication on les utilisateurs  suivantes :
        user1 avec le mot de passe 1234  encoder en bcripte
        user2 avec le mot de passe 1111
        Admin avec le mot de passe 2345
![image](https://user-images.githubusercontent.com/104327012/167254099-2b9d3118-c414-4f2b-ab59-8961e468ebad.png)
    
       Admin avec le mot de passe 2345 Seul le rôle admin peut faire l’ajoute , la modification et la suppression 
       Le message erreur s’affiche quand un utilisateur autre que admin
       Veut faire les taches présidentes  
![image](https://user-images.githubusercontent.com/104327012/167254146-56b24019-cfbf-4457-81b0-6a46534a52c9.png)

       JDBCAuthentication
       les utilisateurs et les mot de passe Sant dans la base de donné(pat_db) phpMyAdmin
       et les mot de passe sont cripty par la méthode bCript
       
![image](https://user-images.githubusercontent.com/104327012/167254164-e9b171b4-bd28-4757-9aa5-aa48a248fd58.png)

       Les utilisateurs
![image](https://user-images.githubusercontent.com/104327012/167254180-1947580f-f536-41e3-b57c-b3c1b908aabb.png)

       Les Rôle
![image](https://user-images.githubusercontent.com/104327012/167254203-acc84989-804e-4721-b28b-c8f1ee6656bd.png)

       La relation user rôle
![image](https://user-images.githubusercontent.com/104327012/167254215-764d1710-ca7a-4521-a9ef-15cdbedd3446.png)

     •	Partie 4 : Spring Security (Stratégie : UserDetailsService)
       Dans cette  partie l'application qui va se charger de l'authentification alors 
       que avant c'est Springs sécurité qui utilise ses mécanisme pour voir
       est ce que l'utilisateur existe dans la base
![image](https://user-images.githubusercontent.com/104327012/167254240-b44a598d-770f-451b-902e-10967b9794cd.png)
    
       Au nivaux de la base de donnée
![image](https://user-images.githubusercontent.com/104327012/167254300-b67bd215-0699-464c-bece-9ea9aa91052b.png)

       L’utilisateur Mohamed à le rôle admin et user
![image](https://user-images.githubusercontent.com/104327012/167254322-f1ddc7b9-65b1-4260-bb2b-1da28cbf3807.png)

        App-User
![image](https://user-images.githubusercontent.com/104327012/167254337-06acd5f3-588f-4618-96d7-7b7e0fadb10b.png)
        
        App-Rôle
![image](https://user-images.githubusercontent.com/104327012/167254350-79d6b1d3-09cc-4e1c-bdf2-f0eb0be441f2.png)
      
      L’utilisateur Hassan à le rôle  user
![image](https://user-images.githubusercontent.com/104327012/167254366-5115f374-03ce-4511-98a9-6589658baccb.png)


        CONCLUSION 
        Cette application nous montrons comment créer une application Java 2EE on utilisant de la html et 
        Framework CSS et AJAX BOOSTRAP pour la forme de l’application et elle nous résumions les différents 
        stratégies d’authentification et de Security des Framework  Spring Boot Spring MVC
        Springs Security  (InMemoryAuthentication, JDBCAuthentication et UserDetailsService) 






