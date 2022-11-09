package tarea2;
import java.util.ArrayList;
public class COMPRADOR {
    
    private int vuelto;
    private String sabor;

    
    
    public COMPRADOR(Expendedor p, Moneda m, int cual){
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
    public String getSabor(){
        return sabor;
    }
    public int getVuelto(){
        return vuelto;
    }
}

