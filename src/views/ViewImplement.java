package views;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public abstract class ViewImplement<T> implements views<T> {

    protected static Scanner scanner=new Scanner(System.in);

     @Override
      public void afficher(List<T> datas) {
      for (T data : datas) {
           System.out.println(data);   
      }
    }
     public  void setScanner(Scanner scanner) {
          this.scanner = scanner;
      }

      public  LocalDate formatDate(String date){
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(date,formatter);
      }

      public  LocalDate formatDate(String date,String format){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
       return LocalDate.parse(date,formatter);

     } 
    public LocalTime formatTime(String time) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return LocalTime.parse(time, formatter);
    }

    public LocalTime formatTime(String time, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return LocalTime.parse(time, formatter);
    }

    
}
