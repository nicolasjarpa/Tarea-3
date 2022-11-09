
package tarea2;

import java.util.ArrayList;

abstract class Moneda{

    
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
     public Moneda100(){
        super();
    }
     
    public int getValor(){
        return super.getValor();
    }
}
 class Moneda500 extends Moneda{
     public Moneda500(){
         super();
     }
     
     public int getValor(){
         return super.getValor()*5;
    }
}
 class Moneda1000 extends Moneda{
     public Moneda1000(){
         super();
     }
     
     public int getValor(){
        return super.getValor()*10;
    }
}
