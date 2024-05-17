package entities;

import java.util.ArrayList;
import java.util.List;

public class Professeur {
    private int id;
    private String nomComplet;
    private String grade;
    private String email;
    private static int nbre;
    private List<Cours> cours=new ArrayList<>();
    
    public Professeur(String nomComplet, String grade, String email) {
        this.id=++nbre;
        this.nomComplet = nomComplet;
        this.grade = grade;
        this.email = email;
    }
    public Professeur() {
        this.id=++nbre;
    }
    public String getNomComplet() {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public static int getNbre() {
        return nbre;
    }
    public static void setNbre(int nbre) {
        Professeur.nbre = nbre;
    }
    public List<Cours> getCours() {
        return cours;
    }
    public void setCours(List<Cours> cours) {
        this.cours = cours;
    }
    @Override
    public String toString() {
        return "Professeur [id=" + id + ", nomComplet=" + nomComplet + ", grade=" + grade + ", email=" + email + "]";
    }

    
}
