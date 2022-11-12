package tarea.pkg3;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
public class COMPRADOR {
    
    private int vuelto;
    private String sabor;
    private DepositoVuelto x;
    private Moneda b;
    private int a;
    private Expendedor r;
    private Bebida aux;
    
    
      
    public COMPRADOR(Expendedor p, Moneda m, int cual){
        x = new DepositoVuelto();
        r=p;

        a=cual;
        x.addMoneda(m);
        Bebida b = null;
        vuelto = 0;
        Moneda n;
       
        
        while(true){
            
            n = p.getVuelto();
            if(n != null){
                vuelto = vuelto + n.getValor();
                System.out.println(vuelto);
            }
            
            else{
                break;
            }
        }
    }  
    public void paint(Graphics g){
        x.paint(g);
       
    }
    public String getSabor(){
        return sabor;
    }
    public int getVuelto(){
        return vuelto;
    }

    public void getmoneda100(){

    } 
    
   /* public Bebida consumirbebida(){
        aux = r.getBebida();
        aux = null;
        return aux;
    }*/
}



