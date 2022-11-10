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
  public JButton rdbA = new JButton("Asesino de monea");
  public JButton rdbB = new JButton("Bendecir Monea");
   public JButton rdbC = new JButton("Q Li moneda ARG");
  public JButton Mon1000 = new JButton();
  public JButton Mon500 = new JButton();
  public JButton Mon100 = new JButton();
  public JTextField txtColor = new JTextField(10);
  private ButtonGroup grupo = new ButtonGroup();

  
    public Interfaz(){
        Moneda100 = new Moneda100();
        Moneda500 = new Moneda500();
        Moneda1000 = new Moneda1000();

        e = new Expendedor(11,1000,1000,1000);
        c= new COMPRADOR(e,Moneda1000,2);
        this.setSize(960, 960);
        this.setTitle("Máquina de Bebidas");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(lamina);
        config();
     
    }
    

    
  @Override
    public void paint(Graphics g){
        super.paint(g);
        c.paint(g);
        e.paint(g);

    }

    public void config(){
        lamina.setLayout(null);
        grupo.add(rdbA);
        rdbA.setBounds(690, 100, 150, 150);
        ImageIcon imagen_boton = new ImageIcon("bsprite.png");
        rdbA.setIcon(new ImageIcon(imagen_boton.getImage().getScaledInstance(rdbA.getWidth(), rdbA.getHeight(), Image.SCALE_SMOOTH)));
        lamina.add(rdbA);
        grupo.add(rdbB);
        rdbB.setBounds(690, 275, 150, 150);
        ImageIcon imagen_boton2 = new ImageIcon("bfanta.png");
        rdbB.setIcon(new ImageIcon(imagen_boton2.getImage().getScaledInstance(rdbB.getWidth(), rdbB.getHeight(), Image.SCALE_SMOOTH)));
        lamina.add(rdbB);
        grupo.add(rdbC);
        rdbC.setBounds(690, 450, 150, 150);
        ImageIcon imagen_boton3 = new ImageIcon("bcock.png");
        rdbC.setIcon(new ImageIcon(imagen_boton3.getImage().getScaledInstance(rdbC.getWidth(), rdbC.getHeight(), Image.SCALE_SMOOTH)));
        lamina.add(rdbC);
        grupo.add(Mon1000);
        Mon1000.setBounds(860, 860, 50, 50);
        ImageIcon mon = new ImageIcon("monea1000.png");
        Mon1000.setIcon(new ImageIcon(mon.getImage().getScaledInstance(Mon1000.getWidth(),Mon1000.getHeight(),Image.SCALE_SMOOTH)));
        lamina.add(Mon1000);
        grupo.add(Mon500);
        Mon500.setBounds(780, 860, 50, 50);
        ImageIcon mon500 = new ImageIcon("monea500.png");
        Mon500.setIcon(new ImageIcon(mon500.getImage().getScaledInstance(Mon500.getWidth(),Mon500.getHeight(),Image.SCALE_SMOOTH)));
        lamina.add(Mon500);
        grupo.add(Mon100);
        Mon100.setBounds(700, 860, 50, 50);
        ImageIcon mon100 = new ImageIcon("monea100.png");
        Mon100.setIcon(new ImageIcon(mon100.getImage().getScaledInstance(Mon100.getWidth(),Mon100.getHeight(),Image.SCALE_SMOOTH)));
        lamina.add(Mon100);
        
    }
    
}
