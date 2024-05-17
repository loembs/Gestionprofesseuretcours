package views;

import entities.Seance;

public class SeanceView extends ViewImplement<Seance>{
        public  Seance saisie(){
        Seance seance=new Seance();
        System.out.println("Entrer la date de la seance");
        seance.setDate(formatDate(scanner.nextLine()));
        System.out.println("Entrer l heure de début");
        seance.setHeureDebut(formatTime(scanner.nextLine()));
        System.out.println("Entrer heure de fin");
        seance.setHeureFin(formatTime(scanner.nextLine()));
        seance.setSalle(scanner.nextLine());
        scanner.nextLine();
        return  seance;
      }

    /*public static statut  saisieStatut(){
        int stat;
         do {
             System.out.println("1-PLANIFIE");
             System.out.println("2-ENCOURS");
             System.out.println("3-TERMINE");
             System.out.println("4-ANNULER");
             stat=scanner.nextInt();
         } while (stat<1 || stat>4);
            return statut.values()[stat-1];
       }*/
    
       /*public static Etat validerEtat(){
        int etat;
         do {
             System.out.println("1-Valider");
             System.out.println("2-Annuler");
             etat=scanner.nextInt();
         } while (etat<1 || etat>2);
            return Etat.values()[etat];
       }*/
   
   
    
}
