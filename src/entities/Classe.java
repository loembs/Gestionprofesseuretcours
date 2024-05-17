package entities;

import java.util.ArrayList;
import java.util.List;

public class Classe {
    private int id;
    private String nomClasse;
    private String filiere;
    private String niveau;
    private static int nbre;
    private List<Cours> cours=new ArrayList<>();

    public Classe(String nomClasse, String filiere, String niveau) {
        this.id=++nbre;
        this.nomClasse = nomClasse;
        this.filiere = filiere;
        this.niveau = niveau;
    }
    public Classe() {
        this.id=++nbre;
    }
    public String getNomClasse() {
        return nomClasse;
    }
    public void setNomClasse(String nomClasse) {
        this.nomClasse = nomClasse;
    }
    public String getFiliere() {
        return filiere;
    }
    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }
    public String getNiveau() {
        return niveau;
    }
    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
    public static int getNbre() {
        return nbre;
    }
    public static void setNbre(int nbre) {
        Classe.nbre = nbre;
    }
    public List<Cours> getCours() {
        return cours;
    }
    public void setCours(List<Cours> cours) {
        this.cours = cours;
    }
    @Override
    public String toString() {
        return "Classe [id=" + id + ", nomClasse=" + nomClasse + ", filiere=" + filiere + ", niveau=" + niveau
                + ", cours=" + cours + "]";
    }
    public void add(Classe classe) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    
}
