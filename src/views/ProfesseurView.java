package views;

import java.util.List;

import core.service;
import entities.Classe;
import entities.Cours;
import entities.Professeur;

public class ProfesseurView extends ViewImplement<Professeur>{
    private service<Cours> servicesCours;
    private service<Professeur> servicesProfesseur;
 
    public ProfesseurView(service<Cours> servicesCours, service<Professeur> servicesProfesseur) {
        this.servicesCours =servicesCours;
        this.servicesProfesseur = servicesProfesseur;
        }
     public  Professeur saisie(){
        Professeur p1=new Professeur();

        System.out.println("Entrer le nomComplet");
        p1.setNomComplet(scanner.nextLine());
        System.out.println("Entrer le grade");
        p1.setGrade((scanner.nextLine()));
        System.out.println("Entrer votre email");
        p1.setEmail((scanner.nextLine()));

        scanner.nextLine();
        return p1;
      }
   @Override
   public  void afficher(List< Professeur>  professeurs){
         for ( Professeur  professeur: professeurs) {
           if (professeur==null) return;
           System.out.println(professeur);
         }
     }
     public Professeur rechercherClassParnom() {
        String nom;
        System.out.println("Entrer le nom du professeur");
        nom = scanner.nextLine();
        return servicesProfesseur.getBy(nom);
  
     }
  
     public void showCoursProf(List<Cours> cours) {
        for (Cours cour: cours) {
           System.out.println(cour.getProfesseur() +
                 "Module: " + cour.getModule() +
                 "professeur : " + cour.getProfesseur()
                 );
        }
     }
    
}
