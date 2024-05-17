package views;

import java.util.List;
import core.service;
import entities.Cours;
import entities.Professeur;
import entities.Classe;

public class CoursView extends ViewImplement<Cours> {
    private service<Cours> serviceCours;
    private service<Classe> servicesClasse;

    public CoursView(service<Cours> serviceCours, service<Classe> servicesClasse) {
        this.serviceCours = serviceCours;
        this.servicesClasse = servicesClasse;
    }

    public Cours saisie() {
        Cours cours = new Cours();
        System.out.println("Entrer le module");
        cours.setModule(scanner.nextLine());
        System.out.println("Entrer un professeur");
        cours.setProfesseur(scanner.nextLine());
        scanner.nextLine();
        return cours;
    }

    @Override
    public void afficher(List<Cours> cours) {
        for (Cours c : cours) {
            if (c == null) return;
            System.out.println(c);
        }
    }
    
}

