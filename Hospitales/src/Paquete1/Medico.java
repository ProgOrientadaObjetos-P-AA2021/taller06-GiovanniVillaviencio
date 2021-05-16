package Paquete1;

public class Medico {
    private String nombre;
    private String especialidad;
    private double sueldo;
    
    public Medico(String n, String e, double s){
        nombre = n;
        especialidad = e;
        sueldo = s;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    public void establecerEspecialidad(String e){
        especialidad = e;
    }
    public void establecerSueldo(double s){
        sueldo = s;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerEspecialidad(){
        return especialidad;
    }
    public double obtenerSueldo(){
        return sueldo;
    }
}
