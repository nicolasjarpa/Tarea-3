package tarea2;
import java.util.ArrayList;
public class Expendedor {
    private Deposito coca;
    private Deposito fanta;
    private Deposito sprite;
    private DepositoVuelto pepe;
    private int vuelto;
    
    int precioCoca;
    int precioFanta;
    int precioSprite;
    
    public Expendedor(int cantidad, int precioCoca, int precioFanta, int precioSprite){
        this.precioCoca = precioCoca;
        this.precioFanta = precioFanta;
        this.precioSprite = precioSprite;
          coca= new Deposito();
           fanta = new Deposito();
          sprite = new Deposito();
          pepe = new DepositoVuelto();
          
           for(int i=0; i<cantidad; i++){
              coca.addBebida(new Coca(i+1000));
              fanta.addBebida(new Fanta(i+2000));
              sprite.addBebida(new Sprite(i+3000));
            }
    }
    
    public Bebida compraBebida(Moneda m, int cual) throws NoHayBebidaException{
        Bebida e = null;
        
        if(m == null){
            throw new NoHayBebidaException("PagoIncorrectoException");
        }
        
        if(cual==1 && m.getValor() >= precioCoca){
            e = coca.getBebida();
            if(e==null){
                pepe.addMoneda(m);
                throw new NoHayBebidaException("NoHayBebidaException");
                
            }
            
            vueltoChavalada(m, precioCoca);
            return e;
        }
            
        if(cual==2 && m.getValor() >= precioFanta){
            e=fanta.getBebida();
             if(e==null){
                 pepe.addMoneda(m);
                throw new NoHayBebidaException("NoHayBebidaException");
            }
             
            vueltoChavalada(m, precioFanta);
            return e;
        }
        
        if(cual == 3 && m.getValor() >= precioSprite){
            e=sprite.getBebida();
             if(e==null){
                 pepe.addMoneda(m);
                throw new NoHayBebidaException("NoHayBebidaException");
            }
             
            vueltoChavalada(m, precioSprite);
            return e;
        }
        

         
                
        if(m.getValor() < precioCoca){
            pepe.addMoneda(m);
            throw new NoHayBebidaException("PagoInsuficienteException");
        }
        
        if(m.getValor() < precioFanta){
            pepe.addMoneda(m);
            throw new NoHayBebidaException("PagoInsuficienteException");
        }
        
        if(m.getValor() < precioSprite){
            pepe.addMoneda(m);
            throw new NoHayBebidaException("PagoInsuficienteException");
        }
        
        
        return null;
    }
    
    
    
    public void vueltoChavalada(Moneda m, int cual){
        int p = (m.getValor() - cual) / 100;
        for (int i = 0; i < p; i++) {
            pepe.Monea100();
        }
    }
    
    public Moneda getVuelto(){
        return pepe.getMoneda();
    }
}

    

