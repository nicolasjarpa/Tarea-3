package tarea.pkg3;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Interfaz extends JFrame implements ActionListener{
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
  public JButton vuelta = new JButton();
  public JTextField txtColor = new JTextField(10);
  private ButtonGroup grupo = new ButtonGroup();
  public  JTextField campoTexto = new JTextField(4);
  int a=0;
  JTextField texto4 = new JTextField();

    
  public Interfaz(){
        Moneda100 = new Moneda100();
        Moneda500 = new Moneda500();
        Moneda1000 = new Moneda1000();

        e = new Expendedor(10,600,200,1000);
        c = new COMPRADOR(e,Moneda1000,2);
        this.setSize(960, 960);
        this.setTitle("Máquina de Bebidas");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(lamina);
        config();
        LineaTexto();
     
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
         rdbA.addActionListener(this);
        grupo.add(rdbB);
        rdbB.setBounds(690, 275, 150, 150);
        ImageIcon imagen_boton2 = new ImageIcon("bfanta.png");
        rdbB.setIcon(new ImageIcon(imagen_boton2.getImage().getScaledInstance(rdbB.getWidth(), rdbB.getHeight(), Image.SCALE_SMOOTH)));
        lamina.add(rdbB);
        rdbB.addActionListener(this);
        grupo.add(rdbC);
        rdbC.setBounds(690, 450, 150, 150);
        ImageIcon imagen_boton3 = new ImageIcon("bcock.png");
        rdbC.setIcon(new ImageIcon(imagen_boton3.getImage().getScaledInstance(rdbC.getWidth(), rdbC.getHeight(), Image.SCALE_SMOOTH)));
        lamina.add(rdbC);
        rdbC.addActionListener(this);
        grupo.add(Mon1000);
        
        Mon1000.setBounds(860, 660, 50, 50);
        ImageIcon mon = new ImageIcon("monea1000.png");
        Mon1000.setIcon(new ImageIcon(mon.getImage().getScaledInstance(Mon1000.getWidth(),Mon1000.getHeight(),Image.SCALE_SMOOTH)));
        lamina.add(Mon1000);
        Mon1000.addActionListener(this);
        grupo.add(Mon500);
        Mon500.setBounds(780, 660, 50, 50);
        ImageIcon mon500 = new ImageIcon("monea500.png");
        Mon500.setIcon(new ImageIcon(mon500.getImage().getScaledInstance(Mon500.getWidth(),Mon500.getHeight(),Image.SCALE_SMOOTH)));
        lamina.add(Mon500);
        Mon500.addActionListener(this);
        grupo.add(Mon100);
        Mon100.setBounds(700, 660, 50, 50);
        ImageIcon mon100 = new ImageIcon("monea100.png");
        Mon100.setIcon(new ImageIcon(mon100.getImage().getScaledInstance(Mon100.getWidth(),Mon100.getHeight(),Image.SCALE_SMOOTH)));
        lamina.add(Mon100);
        Mon100.addActionListener(this);
        vuelta.setBounds(100, 800, 100, 100);
        ImageIcon vuelta1 = new ImageIcon("vuelto.png");
        vuelta.setIcon(new ImageIcon(vuelta1.getImage().getScaledInstance(vuelta.getWidth(),vuelta.getHeight(),Image.SCALE_SMOOTH)));
        lamina.add(vuelta);
    }
public  void LineaTexto(){
        JTextField texto = new JTextField();
        texto.setBounds(550, 150, 80, 50);
        texto.setBackground(Color.white);
        texto.setText("Precio "+e.spriteprice());
        texto.setEditable(false);
        lamina.add(texto);
        JTextField texto2 = new JTextField();
        texto2.setBounds(550, 300, 80, 50);
        texto2.setBackground(Color.white);
        texto2.setText("Precio " +e.fantaprice());
        texto2.setEditable(false);
        lamina.add(texto2);
        JTextField texto3 = new JTextField();
        texto3.setBounds(550, 450, 80, 50);
        texto3.setBackground(Color.white);
        texto3.setText("Precio " +e.cocaprice());
        texto3.setEditable(false);
        lamina.add(texto3);
        
}

 public void actionPerformed(ActionEvent b) {
     
     JTextField texto4 = new JTextField();
        texto4.setBounds(50, 50, 80, 50);
        texto4.setBackground(Color.white);
        texto4.setEditable(false);
        lamina.add(texto4);
        
        
   
  
    if (b.getSource() == rdbA) {
        if(a>=e.spriteprice()){
            e.number=2;
            e.compraBebida();
            a=a-e.spriteprice();
            texto4.setText(String.valueOf("Saldo "+a));
            repaint();
        }
        
         if(a<=e.spriteprice()){
            System.out.println("No dispones de fondos suficientes!");
        }
         
         

        
    }
    if (b.getSource() == rdbB) {
        if(a>=e.fantaprice()){
            e.number=3;
            e.compraBebida();
            a=a-e.fantaprice();
            texto4.setText(String.valueOf("Saldo "+a));
            repaint();
        }
        
        if(a<=e.fantaprice()){
            System.out.println("No dispones de fondos suficientes!");
        }

    }
    if (b.getSource() == rdbC) {
        if(a>=e.cocaprice()){
            e.number=1;
            e.compraBebida();
            a=a-e.cocaprice();
            texto4.setText(String.valueOf("Saldo "+a));
            repaint();
        }
         if(a<=e.cocaprice()){
            System.out.println("No dispones de fondos suficientes!");
        }
    }
    if (b.getSource() == Mon100) {
      a=a+ Moneda100.getValor();
      texto4.setText("Saldo "+a);
    }
    if (b.getSource() == Mon500) {
        a=a+Moneda500.getValor();
        texto4.setText(String.valueOf("Saldo "+a));
    }
    if (b.getSource() == Mon1000) {
        a=a+Moneda1000.getValor();
        texto4.setText(String.valueOf("Saldo "+a));
    }
    
    if(e.tot1==0 || e.tot2==0 || e.tot3==0){
        e.number=0;
    }
         
}
 
 public int getPlata(){
     return a;
 }
 

}

