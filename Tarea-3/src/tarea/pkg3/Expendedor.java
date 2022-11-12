package tarea.pkg3;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Expendedor {
    private Deposito coca;
    private Deposito fanta;
    private Deposito sprite;
    private DepositoVuelto pepe;
    private int vuelto;
    private Image exp;
    private Image pe;
    public int tot1;
    public int tot2;
    public int tot3;
    public ActionEvent b;
    
    
    int precioCoca;
    int precioFanta;
    int precioSprite;
    

    
    public Expendedor(int cantidad, int precioCoca, int precioFanta, int precioSprite){
        this.precioCoca = precioCoca;
        this.precioFanta = precioFanta;
        this.precioSprite = precioSprite;
        tot1 = cantidad;
        tot2 = cantidad;
        tot3 = cantidad;
        
        exp = new ImageIcon("expend.png").getImage();

          coca= new Deposito();
           fanta = new Deposito();
          sprite = new Deposito();
          pepe = new DepositoVuelto();
          
           for(int i=0; i<cantidad; i++){
              coca.addBebida(new Coca(i+1000));
              fanta.addBebida(new Fanta(i+2000));
              sprite.addBebida(new Sprite(i+3000));
            }  
    }
    

    
    public Bebida compraBebida(Moneda m, int cual) throws NoHayBebidaException{
        Bebida e = null;
        
        if(m == null){
            throw new NoHayBebidaException("PagoIncorrectoException");
        }
        
        if(cual==1 && m.getValor() >= precioCoca){
            e = coca.getBebida();
            if(e==null){
                pepe.addMoneda(m);
                throw new NoHayBebidaException("NoHayBebidaException");
                
            }
            
            vueltoChavalada(m, precioCoca);
            return e;
        }
            
        if(cual==2 && m.getValor() >= precioFanta){
            e=fanta.getBebida();
             if(e==null){
                 pepe.addMoneda(m);
                throw new NoHayBebidaException("NoHayBebidaException");
            }
             
            vueltoChavalada(m, precioFanta);
            return e;
        }
        
        if(cual == 3 && m.getValor() >= precioSprite){
            e=sprite.getBebida();
             if(e==null){
                 pepe.addMoneda(m);
                throw new NoHayBebidaException("NoHayBebidaException");
            }
             
            vueltoChavalada(m, precioSprite);
            return e;
        }
        

         
                
        if(m.getValor() < precioCoca){
            pepe.addMoneda(m);
            throw new NoHayBebidaException("PagoInsuficienteException");
        }
        
        if(m.getValor() < precioFanta){
            pepe.addMoneda(m);
            throw new NoHayBebidaException("PagoInsuficienteException");
        }
        
        if(m.getValor() < precioSprite){
            pepe.addMoneda(m);
            throw new NoHayBebidaException("PagoInsuficienteException");
        }
        
        
        return null;
    }
    
    
    
    public void vueltoChavalada(Moneda m, int cual){
       /* int p = (m.getValor() - cual) / 100;
        for (int i = 0; i < p; i++) {
            pepe.Monea100(); 
        } */
    }
    
    public Moneda getVuelto(){
        return pepe.getMoneda(0);
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
    

