package tarea.pkg3;
import java.util.ArrayList;
public class Tarea3 {
    private COMPRADOR com; 
    private Expendedor exp;
    
  public Tarea3(){
       Moneda Moneda100 = new Moneda100();
        Moneda Moneda500 = new Moneda500();
        Moneda Moneda1000 = new Moneda1000();
        exp = new Expendedor (3,100,200,300); 
        com = new COMPRADOR(exp,Moneda1000,2);         
        
  }public static void main(String[] args) {
      Interfaz ventana=new Interfaz();
       ventana.setVisible(true);
       
}
    }