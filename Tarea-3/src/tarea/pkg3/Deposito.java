
package tarea.pkg3;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import javax.swing.ImageIcon;
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
    
    public void paint(Graphics g){
        Bebida b = n.get(0);
        b.paint(g);
    }
    



}
   


