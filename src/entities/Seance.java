package entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Seance {
    private int id;
    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    private static int nbre;
    private Cours cours ;
    private String salle;
    
    public Seance() {
        this.id=++ nbre;
    }
    public Seance(LocalDate date, LocalTime heureDebut, LocalTime heureFin, String salle) {
        this.id=++ nbre;
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.salle = salle;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public LocalTime getHeureDebut() {
        return heureDebut;
    }
    public void setHeureDebut(LocalTime heureDebut) {
        this.heureDebut = heureDebut;
    }
    public LocalTime getHeureFin() {
        return heureFin;
    }
    public void setHeureFin(LocalTime heureFin) {
        this.heureFin = heureFin;
    }
    public static int getNbre() {
        return nbre;
    }
    public static void setNbre(int nbre) {
        Seance.nbre = nbre;
    }
    public Cours getCours() {
        return cours;
    }
    public void setCours(Cours cours) {
        this.cours = cours;
    }
    public String getSalle() {
        return salle;
    }
    public void setSalle(String salle) {
        this.salle = salle;
    }
    @Override
    public String toString() {
        return "Seance [id=" + id + ", date=" + date + ", heureDebut=" + heureDebut + ", heureFin=" + heureFin
                + ", salle=" + salle + "]";
    }
    
}
