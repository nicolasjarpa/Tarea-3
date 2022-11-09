package tarea.pkg3;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
public class Interfaz extends JFrame{
  public JPanel lamina = new JPanel();
  private Expendedor e;
    public Interfaz(){
        e = new Expendedor(1,1,1,1);

        this.setSize(960, 960);
        this.setTitle("Maduras calientes en tu zona");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(lamina);
    }
    
  @Override
    public void paint(Graphics g){
        super.paint(g);
        e.paint(g);
    }
}
