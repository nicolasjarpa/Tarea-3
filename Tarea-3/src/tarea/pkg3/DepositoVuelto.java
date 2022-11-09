
package tarea2;
import java.util.ArrayList;
class DepositoVuelto{
    private ArrayList <Moneda> m;
    
    
    public DepositoVuelto(){
      m = new ArrayList();
    }
    public void addMoneda(Moneda b){
        m.add(b);
    }
    
    public void Monea100(){
        m.add(new Moneda100());
    }
    
    public Moneda getMoneda(){

        if(m.size()==0){
            return null;
        }
        
        return m.remove(0);
        
    }

}