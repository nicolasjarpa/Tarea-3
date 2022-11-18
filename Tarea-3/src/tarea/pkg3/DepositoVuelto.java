
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
    
     public Moneda removeMoneda(){

        if(m.size()==0){
            return null;
        }
        
        return m.remove(0);
        
    }  
    
    public ArrayList getArray(){
        return m;
    }
    
    public void paint(Graphics g, int n){
        if(n == 1){
            for(int i =0; i<m.size(); i++){
                m.get(i).paint(g, 5+50*(i), 780);
            }
        }
        if(n == 2){
            for(int i =0; i<m.size(); i++){
                m.get(i).paint(g, 580, 700);
            }
        }
 
    }
}

