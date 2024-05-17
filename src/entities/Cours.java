package entities;

import java.util.ArrayList;
import java.util.List;

public class Cours {
    private int id;
    private String module;
    private String professeur;
    private static int nbre;
    private List<Classe> classes=new ArrayList<>();
    
    
    private List<Seance> seances  =new ArrayList<>();
    
    public Cours(String module, String professeur) {
        this.id=++nbre;
        this.module = module;
        this.professeur = professeur;
    }
    public Cours() {
        this.id=++nbre;
    }
    public String getModule() {
        return module;
    }
    public void setModule(String module) {
        this.module = module;
    }
    public String getProfesseur() {
        return professeur;
    }
    public void setProfesseur(String professeur) {
        this.professeur = professeur;
    }
    public static int getNbre() {
        return nbre;
    }
    public static void setNbre(int nbre) {
        Cours.nbre = nbre;
    }
  
    public List<Seance> getSeances() {
        return seances;
    }
    public void setSeances(List<Seance> seances) {
        this.seances = seances;
    }

    @Override
    public String toString() {
        return "Cours [id=" + id + ", module=" + module + ", professeur=" + professeur + "]";
    }
    public void add(Cours cours) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public List<Classe> getClasses() {
        return classes;
    }
    public void setClasses(List<Classe> classes) {
        this.classes = classes;
    }
    
}
