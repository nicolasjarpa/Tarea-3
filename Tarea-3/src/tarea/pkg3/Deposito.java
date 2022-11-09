
package tarea2;
import java.util.ArrayList;
class Deposito{
    private ArrayList <Bebida> n;
    
    public Deposito(){
      n = new ArrayList <Bebida>();
    }
    public void addBebida(Bebida b){
        n.add(b);
    }
    public Bebida getBebida(){

        if(n.size()==0){
            return null;
        }
        
        return n.remove(0);
        
    }

}
   


