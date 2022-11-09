
package tarea.pkg3;
import java.awt.Graphics;
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
        public void paint(Graphics g){
        Moneda a = m.get(0);
        a.paint(g);
    }
    public Moneda getMoneda(){

        if(m.size()==0){
            return null;
        }
        
        return m.remove(0);
        
    }
}