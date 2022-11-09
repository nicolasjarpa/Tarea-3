package tarea.pkg3;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
public class COMPRADOR {
    
    private int vuelto;
    private String sabor;
    private Moneda m;
    
    
    public COMPRADOR(Expendedor p, Moneda m, int cual){
         m = m;
        Bebida b = null;
        vuelto = 0;
        Moneda n;
       
        
        try{
            b = p.compraBebida(m, cual);
            sabor = b.beber();
        }
        catch(NoHayBebidaException e){
            System.out.println(e.getMessage());
            sabor = null;
        }
        
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
       m.paint(g);
    
    }
    public String getSabor(){
        return sabor;
    }
    public int getVuelto(){
        return vuelto;
    }
}
    


