package views;
import java.util.List;
import java.util.Scanner;

public interface views<T>  {
     T saisie();
    void afficher(List<T> datas);
    void setScanner(Scanner scanner);
} 
