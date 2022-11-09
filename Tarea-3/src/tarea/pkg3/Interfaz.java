package tarea.pkg3;
import javax.swing.*;
import java.awt.*;
public class Interfaz extends JFrame{
  public JPanel lamina = new JPanel();
    public Interfaz(){

        this.setSize(450, 300);
        this.setTitle("Maquina Expendedora");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(lamina);
    }
}
