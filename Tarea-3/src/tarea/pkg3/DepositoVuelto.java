
package tarea.pkg3;
import java.awt.Graphics;
import java.util.ArrayList;
class DepositoVuelto{
    private ArrayList <Moneda> m;
    
    
    public DepositoVuelto(){
      m = new ArrayList<Moneda>();
    }
    public void addMoneda(Moneda b){
        m.add(b);
    }
  
    public void Monea100(){
        m.add(new Moneda100());
        
    }
    public void Monea500(){
        m.add(new Moneda500());
    }
    public void Monea1000(){
        m.add(new Moneda1000());
    }

    public Moneda getMoneda(int n){

        if(m.size()==0){
            return null;
        }
        
        return m.get(n);
        
    }  
    
    public ArrayList getArray(){
        return m;
    }
    
    public void paint(Graphics g){
      Moneda a100 = m.get(0);
      a100.paint(g);
    }
}
