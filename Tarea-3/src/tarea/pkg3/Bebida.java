package tarea2;
abstract class Bebida {
 private int xd;
    public Bebida(int a){
        xd=a;
        
    }
    public int getSerie(){
        return xd;
    }
    public String beber(){
        return "sabor: ";
    }
}

class Fanta extends Bebida{
        public Fanta(int a){
    super(a);
}
public String beber(){
    
return super.beber()+"Fanta";
}
}


class Coca extends Bebida{
 public Coca(int a){
    super(a);
}
public String beber(){
    
return super.beber()+"coca";
}
}


class Sprite extends Bebida{
   public Sprite(int a){
    super(a);
}
public String beber(){
    
return super.beber()+"sprite";
}
}
