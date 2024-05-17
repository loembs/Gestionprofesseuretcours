import java.util.Scanner;
import entities.Classe;
import entities.Cours;
import entities.Seance;
import entities.Professeur;
import services.servicesClasse;
import services.serviceCours;
import services.serviceProfesseur;
import services.servicesSeance;
import views.ClasseView;
import views.CoursView;
import views.ProfesseurView;
import views.SeanceView;
import core.service;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        service<Professeur> serviceProfesseur = new serviceProfesseur();
        service<Cours> serviceCours = new serviceCours();
        service<Seance> serviceSeance = new servicesSeance();
        service<Classe> serviceClasse = new servicesClasse();

        // Injection de Dépendance
        CoursView coursView = new CoursView(serviceCours, serviceClasse);
        ProfesseurView professeurView = new ProfesseurView(serviceCours, serviceProfesseur);
        SeanceView seanceView = new SeanceView();

        int choix;
        do {
            choix = menu();
            switch (choix) {
                case 1:
                    serviceProfesseur.save(professeurView.saisie());
                    break;
                case 2:
                    professeurView.afficher(serviceProfesseur.show());
                    break;
                case 3:
                    serviceCours.save(coursView.saisie());
                    break;
                case 4:
                    coursView.afficher(serviceCours.show());
                    break;
                case 5:
                    Professeur professeur = professeurView.rechercherClassParnom();
                    if (professeur == null) {
                        System.out.println("Ce professeur n'existe pas");
                    }else {
                        System.out.println(professeur);
                        professeurView.showCoursProf(professeur.getCours());
                    }
                    break;
                case 6:
                    System.out.println("Aurevoir à la prochaine");
                    break;
                default:
                    break;
            }
        } while (choix != 6);
    }

    public static int menu() {
        System.out.println("1- Ajouter un Professeur");
        System.out.println("2- Lister les Professeurs");
        System.out.println("3- Créer un Cours ");
        System.out.println("4- Lister tous les cours");
        System.out.println("5- Lister les cours d’un professeur");
        System.out.println("6- Quitter");
        return scanner.nextInt();
    }
}
