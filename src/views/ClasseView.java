package views;
import java.security.Provider.Service;
import java.util.List;
import core.service;
import entities.Classe;
import enums.Filiere;
public class ClasseView extends ViewImplement<Classe> {
    private  service<Classe> classeservice;
      public  ClasseView( service<Classe> classeservice){
           this.classeservice=classeservice;
       }
    private service<Classe> servicesClasse;
     public  Classe saisie(){
        Classe cl=new Classe();
        System.out.println("Entrer le nom de la classe ");
        cl.setNomClasse(scanner.nextLine());
        System.out.println("Choisissez une filière ");
        System.out.println(saisiefiliere());
        scanner.nextLine();
        System.out.println("Entrer votre niveau");
        cl.setNiveau((scanner.nextLine()));
  
        return cl;
      }
   @Override
   public  void afficher(List<Classe> classes){
         for (Classe classe: classes) {
           if (classe==null) return;
           System.out.println(classe);
         }
     }
     public static Filiere saisiefiliere(){
        int fi;
         do {
             System.out.println("1-GLRS");
             System.out.println("2-ETSE");
             System.out.println("3-MAIE");
             System.out.println("4-CDSD");
             System.out.println("4-CPD");
             System.out.println("5-TTL");
             fi=scanner.nextInt();
         } while (fi<1 || fi>5);
            return Filiere.values()[fi-1];
       }
    
}
