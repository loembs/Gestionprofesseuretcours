package services;

import java.util.ArrayList;
import java.util.List;

import core.service;
import entities.Classe;

public class servicesClasse implements service<Classe> {
    
    List<Classe> classes=new ArrayList<>();
    @Override
    public boolean save(Classe classe){
        classes.add(classe);
        return false;
    }
    @Override
    public List<Classe> show(){
        return classes;
    }

    @Override
    public Classe getBy(String nomclasse){
       for (Classe classe : classes) {
              if (classe.getNomClasse().compareTo(nomclasse)==0) {
                  return classe;
              } 
        }
          return null;
    }
    @Override
    public Classe rechercherClassParnom() {
        throw new UnsupportedOperationException("Unimplemented method 'rechercherClassParnom'");
    }
    
}
