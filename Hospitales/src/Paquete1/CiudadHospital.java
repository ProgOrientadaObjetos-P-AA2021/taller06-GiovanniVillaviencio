
package Paquete1;
public class CiudadHospital {
    private String nombreCiu;
    private String nombreProvin;
    
    public CiudadHospital(String nc, String np){
        nombreCiu = nc;
        nombreProvin = np;
    }
    
    public void establecerNombreCiudad(String nc){
        nombreCiu = nc;
    }
    public void establecerNombreProvincia(String np){
        nombreProvin = np;
    }
    public String obtenerNombreCiudad(){
        return nombreCiu;
    }
    public String obtenerNombreProvincia(){
        return nombreProvin;
    }
}
