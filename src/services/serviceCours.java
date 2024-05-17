package services;

import java.util.ArrayList;
import java.util.List;

import core.service;
import entities.Cours;

public class serviceCours implements service<Cours>{
    List<Cours> cours=new ArrayList<>();
    private String md;
    @Override
    public boolean save(Cours cour){
        cours.add(cour);
        return false;
    }
    @Override
    public List<Cours>  show(){
        return cours;
    }

    @Override
    public Cours getBy(String md){
    for (Cours cour : cours) {
              if (cour.getModule().compareTo(md)==0) {
                  return cour;
              } 
        }
          return null;
    }
    @Override
    public Cours rechercherClassParnom() {
        throw new UnsupportedOperationException("Unimplemented method 'rechercherClassParnom'");
    }

    
}
