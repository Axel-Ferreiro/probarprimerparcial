
package ejercicioparcial;

import java.util.ArrayList;


public class Concesionario {
    
    private ArrayList<Auto> autos;
    
    public void agregarAuto(Auto auto){
        if(auto != null){
            autos.add(auto);
        }
    }
    
    public Auto buscarAuto(String patente){
        for(Auto a: autos){
            if(patente.equals(a)){
                return a;
            }
        }
        return null;
    }
    
    public void listarAuto(){
        for(Auto a: autos){
            System.out.println(a);
        }
    }
}
