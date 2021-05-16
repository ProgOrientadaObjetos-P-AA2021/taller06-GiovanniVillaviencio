package Paquete1;

public class Enfermero {

    private String nombre;
    private String tipo;
    private double sueldo;

    public Enfermero(String n, String t, double s) {
        nombre = n;
        tipo = t;
        sueldo = s;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerTipo(String t) {
        tipo = t;
    }

    public void establecerSueldo(double s) {
        sueldo = s;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }
}
