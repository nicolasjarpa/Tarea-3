package tarea.pkg3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;

abstract class Bebida {
    
    public abstract void paint(Graphics g);
    private int xd;

    public Bebida(int a) {
        xd = a;

    }

    public int getSerie() {
        return xd;
    }

    public String beber() {
        return "sabor: ";
    }
}

class Fanta extends Bebida {

    public Fanta(int a) {
        super(a);
    }

    public String beber() {

        return super.beber() + "Fanta";
    }

    public void paint(Graphics g) {

    }
}

class Coca extends Bebida {
    private Image coca;


    public Coca(int a) {
        super(a);
        coca = new ImageIcon("coca.png").getImage();
    }
    
    @Override
    public void paint(Graphics g) {
        ImageObserver observer = new ImageObserver() {

            @Override
            public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
                return true;
            }
        };
        
        g.drawImage(coca, 0, 0, 225, 225, null);

    }

    

    public String beber() {

        return super.beber() + "coca";
    }


}

class Sprite extends Bebida {

    public Sprite(int a) {
        super(a);
    }

    public String beber() {

        return super.beber() + "sprite";
    }

    public void paint(Graphics g) {

    }
}
