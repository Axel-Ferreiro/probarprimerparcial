
package ejercicioparcial;


public class Auto {
    
    private String patente;
    private String marca;
    private int modelo;
    
    public Auto(String patente, String marca , int modelo){
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    protected String getPatente(){
        return patente;
    }
    
}
