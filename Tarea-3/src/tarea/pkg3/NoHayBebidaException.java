
package tarea2;


public class NoHayBebidaException extends Exception { // Tiene el nombre nohaybebidaexception pero es una exception general para todas las excepciones ya que tiene un string para personalizarlass
    
    public NoHayBebidaException(String mensaje){
        super(mensaje);
    }
    
}
