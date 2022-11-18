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
  private DepositoVuelto p;
  public JButton rdbA = new JButton("Asesino de monea");
  public JButton rdbB = new JButton("Bendecir Monea");
  public JButton rdbC = new JButton("Q Li moneda ARG");
  public JButton Mon1000 = new JButton();
  public JButton Mon500 = new JButton();
  public JButton Mon100 = new JButton();
  public JButton vuelta = new JButton();
  public JButton Llenar = new JButton();
  public JButton bebia = new JButton();
  public JButton test = new JButton("Rellenar 7w7");
  public JTextField txtColor = new JTextField(10);
  public JButton meterplata = new JButton("Insertar dinero");
  private ButtonGroup grupo = new ButtonGroup();
  public  JTextField campoTexto = new JTextField(4);
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
        vuelta.addActionListener(this);
        vuelta.setBounds(500, 600, 100, 100);
        ImageIcon vuelta1 = new ImageIcon("vuelto.png");
        vuelta.setIcon(new ImageIcon(vuelta1.getImage().getScaledInstance(vuelta.getWidth(),vuelta.getHeight(),Image.SCALE_SMOOTH)));
        lamina.add(vuelta);
        
        bebia.addActionListener(this);
        bebia.setBounds(230, 540, 50, 50);
        lamina.add(bebia);
        
        Llenar.addActionListener(this);
        Llenar.setBounds(125, 0, 410, 500);
        Llenar.setContentAreaFilled(false);
        Llenar.setBorderPainted(false);
        Llenar.setOpaque(false);
        Llenar.setVisible(false);
        
        lamina.add(Llenar);
        
        test.addActionListener(this);
        test.setBounds(10, 400, 110, 30);
        lamina.add(test);
        
        meterplata.addActionListener(this);
        meterplata.setBounds(530, 380, 140, 30);
        lamina.add(meterplata);
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
        JTextField texto4 = new JTextField();
        texto4.setBounds(50, 50, 80, 50);
        texto4.setBackground(Color.white);
        texto4.setEditable(false);
        lamina.add(texto4);
        
     JTextField texto5 = new JTextField();
        texto5.setBounds(50, 100, 100, 50);
        texto5.setBackground(Color.white);
        texto5.setEditable(false);
        lamina.add(texto5);
           texto4.setText(String.valueOf("Saldo "+e.a));
    texto5.setText(String.valueOf("Maquina "+e.uta));
}

 public void actionPerformed(ActionEvent b) {
     
     
        
        
   
  
    if (b.getSource() == rdbA) {
        if(e.uta>=e.spriteprice()){
            e.number=2;
            e.compraBebida();
            e.uta=e.uta-e.spriteprice();
            System.out.println("Bebidas sprite comprada");
            LineaTexto();
            repaint();
        }
        
        else if(e.uta-e.spriteprice()<0){
            System.out.println("No dispones de fondos suficientes!");
        }
         
         

        
    }
   else if (b.getSource() == rdbB) {
        if(e.uta>=e.fantaprice()){
            e.number=3;
            e.compraBebida();
            e.uta=e.uta-e.fantaprice();
            System.out.println("Bebidas fanta comprada");
            LineaTexto();
            e.vuelto=e.uta-e.fantaprice();
            e.getVuel2(e.vuelto);
            repaint();
          
        }
        
        else if(e.a-e.fantaprice()<0){
            System.out.println("No dispones de fondos suficientes!");
        }

    }
   else if (b.getSource() == rdbC) {
        if(e.uta>=e.cocaprice()){
            e.number=1;
            e.compraBebida();
            e.uta=e.uta-e.cocaprice();
            System.out.println("Bebidas Coca cola comprada");
            LineaTexto();
            repaint();
        }
        else if(e.uta-e.cocaprice()<0){
            System.out.println("No dispones de fondos suficientes!");
        }
    }
    else if (b.getSource() == Mon100) {
      e.a=e.a+ Moneda100.getValor();
      e.addMoneda(new Moneda100());
      System.out.println("Saldo +100");
      LineaTexto();
      repaint();
    }
    else if (b.getSource() == Mon500) {
        e.a=e.a+Moneda500.getValor();
        e.addMoneda(new Moneda500());
        System.out.println("Saldo +500");
        LineaTexto();
        repaint();
    }
    else if (b.getSource() == Mon1000) {
        e.a=e.a+Moneda1000.getValor();
        e.addMoneda(new Moneda1000());
        System.out.println("Saldo +1000");
        LineaTexto();
       repaint();
    }
    
    else if(b.getSource() == test){
        e.reponerBebidas();
        System.out.println("Bebidas Repuestas");
        repaint();
    }
    
    else if(b.getSource() == bebia){
        e.getaBebida();
        repaint();
    }
    
    else if(b.getSource() == meterplata){
        e.uta = e.a+e.uta;
        System.out.println("dinero introducido en maquina "+e.a);
        System.out.println("dinero total en maquina "+e.uta);
        e.a=0;
      LineaTexto();
        repaint();
    }
    
    else if(b.getSource() == vuelta){
        if(e.uta>0){    
            e.getVuel2(e.uta);
            e.uta=e.uta-100;
            e.a=e.a+100;
            for(int i =0; i<(e.uta)/100;i++){
            e.addMoneda(new Moneda100());
            e.draken.removeMoneda();
            }
            System.out.println("entregando vuelto");
           LineaTexto();
            e.draken.removeMoneda();
            repaint();
        }
           else if(e.uta==0){
                System.out.println("No tienes dinero en la maquina!");
        }
    }
    LineaTexto();
    repaint();
}
 

 

}

