package core;

import java.util.List;

public interface service<T> {

    boolean save(T objet);
    List<T> show();
    T getBy(String value);
    T rechercherClassParnom();

    
}
