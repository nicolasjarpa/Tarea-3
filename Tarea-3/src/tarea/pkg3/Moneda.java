
package tarea.pkg3;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;
import java.util.ArrayList;

abstract class Moneda{
public abstract void paint(Graphics g);
    
    public Moneda(){
    
    }
    public String getSerie(){
        return "serie"+this.toString();
    }
    public int getValor(){
     
        return 100;
     
    }
}
 class Moneda100 extends Moneda{
      private Image Moneda100;
     public Moneda100(){
        super();
        Moneda100= new ImageIcon("monea100.png").getImage();
    }
     
    public int getValor(){
        return super.getValor();
    }

    @Override
    public void paint(Graphics g) {
         ImageObserver observer = new ImageObserver() {

            @Override
            public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
                return true;
            }
        };
        
        g.drawImage(Moneda100,300 , 300, 225, 225, null);
    }
        
    }
 class Moneda500 extends Moneda{
     private Image Moneda500;
     public Moneda500(){
         super();
           Moneda500= new ImageIcon("monea500.png").getImage();
     }
     
     public int getValor(){
         return super.getValor()*5;
    }

    @Override
    public void paint(Graphics g) {
         ImageObserver observer = new ImageObserver() {

            @Override
            public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
                return true;
            }
        };
        
        g.drawImage(Moneda500,300 , 300, 225, 225, null);
    }
        
    }

 class Moneda1000 extends Moneda{
     private Image Moneda1000;
     public Moneda1000(){
         super();
         Moneda1000= new ImageIcon("monea1000.png").getImage();
     }
     
     public int getValor(){
        return super.getValor()*10;
    }
      public void paint(Graphics g) {
         ImageObserver observer = new ImageObserver() {

            @Override
            public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
                return true;
            }
        };
        
        g.drawImage(Moneda1000,500 , 300, 225, 225, null);
    }
 }
