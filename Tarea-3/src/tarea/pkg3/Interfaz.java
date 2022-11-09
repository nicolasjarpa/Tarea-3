package tarea.pkg3;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
public class Interfaz extends JFrame{
  public JPanel lamina = new JPanel();
  private Expendedor e;
  private COMPRADOR c;
  private Moneda Moneda100;
    private Moneda Moneda500;
      private Moneda Moneda1000;
    public Interfaz(){
        Moneda100 = new Moneda100();
        Moneda500 = new Moneda500();
        Moneda1000 = new Moneda1000();
        e = new Expendedor(2,1000,100,100);
        c= new COMPRADOR(e,Moneda1000,2);
        this.setSize(960, 960);
        this.setTitle("Máquina de Bebidas");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(lamina);
     
    }
    
  @Override
    public void paint(Graphics g){
        super.paint(g);
        c.paint(g);
        e.paint(g);
        
        
        
        
        
        
    }
}
