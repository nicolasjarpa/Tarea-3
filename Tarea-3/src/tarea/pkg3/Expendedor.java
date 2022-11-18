package tarea.pkg3;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Expendedor{
    private Deposito coca;
    private Deposito fanta;
    private Deposito sprite;
    public DepositoVuelto pepe;
    public DepositoVuelto draken;
    public int vuelto;
    private Image exp;
    private Image pe;
    public int tot1;
    public int tot2;
    public int tot3;
    private int totgeneral;
    public ActionEvent b;
    public int number=0;
    public Bebida po;
    public int a=0;
    private Bebida aux;
    public int uta=0;

    
    private int precioCoca;
    private int precioFanta;
    private int precioSprite;
    int CuantoVuelto;
    

    
    public Expendedor(int cantidad, int precioCoca, int precioFanta, int precioSprite){
        this.precioCoca = precioCoca;
        this.precioFanta = precioFanta;
        this.precioSprite = precioSprite;
        tot1 = cantidad;
        tot2 = cantidad;
        tot3 = cantidad;
        totgeneral=cantidad;
        exp = new ImageIcon("expend.png").getImage();
        coca= new Deposito();
        fanta = new Deposito();
        sprite = new Deposito();
        pepe = new DepositoVuelto();
        draken = new DepositoVuelto();
          
           for(int i=0; i<cantidad; i++){
              coca.addBebida(new Coca(i+1000));
              fanta.addBebida(new Fanta(i+2000));
              sprite.addBebida(new Sprite(i+3000));
            }
    }


    public void reponerBebidas(){
        for(int i=0; i<totgeneral; i++){
            coca.addBebida(new Coca(i+1000));
            tot1=totgeneral;
            
        }
        for(int i=0; i<totgeneral; i++){
            fanta.addBebida(new Fanta(i+2000));
            tot2=totgeneral;
        }
    
        for(int i=0; i<totgeneral; i++){
            sprite.addBebida(new Sprite(i+3000));
            tot3=totgeneral;
        }
    }
    

    
    public void compraBebida(){
        int v=0;

    
        if(number==3 && tot3 >0){
            
            po = fanta.getBebida();
            tot3 = tot3-1;
            

        }
        
                    
            
        if(number==2 && tot2>0){
            po = sprite.getBebida();
            tot2 = tot2-1;

        }
        
        if(number==1 && tot1>0){
            po =coca.getBebida();
            tot1=tot1-1;
        }
        
          int p = (a - precioCoca) / 100;
          int pp =(a-precioSprite)/100;
          int ppp =(a-precioFanta)/100;
        for (int i = 0; i < p; i++) {
            pepe.Monea100(); 
            
    }
        for (int i = 0; i < pp; i++) {
            pepe.Monea100();
        }
        for (int i = 0; i < ppp; i++) {
            pepe.Monea100();
        }
    }
    
    
    public int vueltoChavalada(){
        int p = 0; 
        for (int i = 0; i < draken.getArray().size() ; i++) {
            p += 100;
        }
        return p;
    }
    
    public Moneda getVuelto(){
        
        return pepe.getMoneda(0);
    }
    
    public void getVuel2(int n){
        while(n>0){
            pepe.Monea100();
            n-=100;
        }
    }
    
    public void addMoneda(Moneda m){
        draken.addMoneda(m);
    }
    
   /* public Bebida getBebida(){
        if(number==1){
            return po.Coca.beber();
        }
    } */
        public Bebida getaBebida(){
        aux = po;
        if(po!=null){
         System.out.println("Glugluglu");    
        }
        else{
        System.out.println("No hay bebida para consumir");}
        po = null;
        
        return aux;
    }
    
    public void paint(Graphics g){
        
        
        g.drawImage(exp, -400, 0, 1480, 800, null);
        if(tot1>10){
            tot1 = 10;
        }
         if(tot2>10){
            tot2 = 10;
        }
          if(tot3>10){
            tot3 = 10;
        }
          
        else if(number==1 && po!=null){
              po.paint(g, 165, 575);

        }
        else if(number==2 && po!=null){
              po.paint(g, 165, 575);

        }
        else  if(number==3 && po!=null){
              po.paint(g, 165, 575);

        }

        int j=0;
        for(int i=0; i<tot1; i++){
            
            coca.paint(g, 165+j, 475);
            j=j+28;
        }
        int l=0;
        for(int i=0; i<tot2; i++){

            sprite.paint(g, 165+l, 331);
            l=l+28;
        }
        int f=0;
        for(int i=0; i<tot3; i++){

            fanta.paint(g, 165+f, 400);

            f=f+28;
        }
        if(uta!=0 && a==0){
           draken.paint(g,1); 
        }
        
        if(uta!=0){
            pepe.paint(g,2);
        }
         
        
    }
    
public int  cocaprice(){
    return precioCoca;
}
public int  spriteprice(){
    return precioSprite;
}
public int  fantaprice(){
    return precioFanta;
}


}
    

