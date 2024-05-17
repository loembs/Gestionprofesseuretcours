package services;

import java.util.ArrayList;
import java.util.List;
import entities.Seance;
import core.service;

public class servicesSeance implements service<Seance> {
    List<Seance> seances=new ArrayList<>();
    @Override
    public boolean save(Seance seance){
        seances.add(seance);
        return false;
    }
    @Override
    public List<Seance>  show(){
        return seances;
    }
    @Override
    public Seance getBy(String value) {
        throw new UnsupportedOperationException("Unimplemented method 'getBy'");
    }
    @Override
    public Seance rechercherClassParnom() {
        throw new UnsupportedOperationException("Unimplemented method 'rechercherClassParnom'");
    }
  
}
