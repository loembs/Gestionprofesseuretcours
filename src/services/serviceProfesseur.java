package services;
import entities.Classe;
import entities.Professeur;
import java.util.ArrayList;
import java.util.List;
import core.service;

public class serviceProfesseur implements service<Professeur>  {

    List<Professeur> professeurs=new ArrayList<>();
    @Override
    public boolean save(Professeur professeur){
        professeurs.add(professeur);
        return false;
    }
    @Override
    public List<Professeur> show(){
        return professeurs;
    }
      @Override
    public Professeur getBy(String nom){
       for (Professeur professeur : professeurs) {
              if (professeur.getNomComplet().compareTo(nom)==0) {
                  return professeur;
              } 
        }
          return null;
    }
    @Override
    public Professeur rechercherClassParnom() {
        throw new UnsupportedOperationException("Unimplemented method 'rechercherClassParnom'");
    }
    
    
}
