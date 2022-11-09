package tarea.pkg3;
import java.util.ArrayList;
public class Tarea3 {
    public static void main(String[] args) {
        
        Expendedor maquina = new Expendedor(2,500,1000,1000);
        Moneda Moneda100 = new Moneda100();
        Moneda Moneda500 = new Moneda500();
        Moneda Moneda1000 = new Moneda1000();
        System.out.println(Moneda100.getSerie());
        System.out.println(Moneda500.getSerie());
        System.out.println(Moneda1000.getSerie());
        System.out.print("\n");

        
        COMPRADOR ElPepe = new COMPRADOR(maquina, Moneda1000, 3);
        System.out.println(ElPepe.getSabor());
        System.out.println("Vuelto a recibir: " + ElPepe.getVuelto());
        System.out.print("\n");
        
        COMPRADOR EteSech = new COMPRADOR(maquina, Moneda1000, 1);
        System.out.println(EteSech.getSabor());
        System.out.println("Vuelto a recibir: " + EteSech.getVuelto());
        System.out.print("\n");
        
        COMPRADOR Tilin = new COMPRADOR(maquina, null, 3);
        System.out.println(Tilin.getSabor());
        System.out.println("Vuelto a recibir: " + Tilin.getVuelto());
        System.out.print("\n");

    }
}

