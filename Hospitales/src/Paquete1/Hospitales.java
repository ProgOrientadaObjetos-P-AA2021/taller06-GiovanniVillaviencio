
package Paquete1;

public class Hospitales {
    private String nombreHos;
    private CiudadHospital ciudadHospital;
    private int numEspecialidades;
    private Medico[] medicos;
    private Enfermero[] enfermeros;
    private double sueldos;
    private String direccion;
    
    public Hospitales(String n, CiudadHospital cd, int ne, Medico[] md,
            Enfermero[] e,  String drc){
        nombreHos = n;
        ciudadHospital = cd;
        numEspecialidades = ne;
        medicos = md;
        enfermeros = e;
        direccion = drc;
    }
    public void establecerNombreHos(String n){
        nombreHos = n;
    }
    public void establecerCiudadHos(CiudadHospital cd){
        ciudadHospital = cd;
    }
    public void establecerNumEspe(int ne){
        numEspecialidades = ne;
    }
    public void establecerMedicos(Medico[] md){
        medicos = md;
    }
    public void establecerEnfermeros(Enfermero[] e){
        enfermeros = e;
    }
    public void establecerSueldos(){
        double suma = 0;
        double suma1 = 0;
        for(int i = 0;i < obtenerMedicos().length;i++){
            suma = suma + obtenerMedicos()[i].obtenerSueldo();    
        }
        for(int i =0; i < obtenerEnfermeros().length;i++){
            suma1 = suma1 + obtenerEnfermeros()[i].obtenerSueldo();   
        }
        sueldos = suma + suma1;
    }
    public void establecerDireccion(String drc){
        direccion = drc;
    }
    public String obtenerNombreHos(){
        return nombreHos;
    }
    public CiudadHospital obtenerCiudadHos(){
        return ciudadHospital;
    }
    public int obtenerNumEspe(){
        return numEspecialidades;
    }
    public Medico[] obtenerMedicos(){
        return medicos;
    }
    public Enfermero[] obtenerEnfermeros(){
        return enfermeros;
    }
    public double obtenerSueldos(){
        return sueldos;
    }
    public String obtenerDireccion(){
        return direccion;
    }
    
    @Override
    public String toString(){
        String cadena = "Administración de Hospitales\n";
        cadena = String.format("%s %s\n Dirección: %s\n Ciudad:%s\n "
                + "Provincia: %s\n Número de especialidades: %d\n ",cadena,
                obtenerNombreHos(),obtenerDireccion(),
                obtenerCiudadHos().obtenerNombreCiudad(),
                obtenerCiudadHos().obtenerNombreProvincia(),
                obtenerNumEspe());
        
        cadena = String.format("%s\nListado de medicos\n",cadena);
        for(int i = 0; i <obtenerMedicos().length;i++){
            cadena = String.format("%s\t\t%s - Sueldo: %.2f - %s\n",cadena,
                    obtenerMedicos()[i].obtenerNombre(),
                    obtenerMedicos()[i].obtenerSueldo(),
                    obtenerMedicos()[i].obtenerEspecialidad());          
        }
        cadena= String.format("%s\nListado de enfermeros(as)\n",cadena);
        for(int i = 0; i < obtenerEnfermeros().length;i++){
            cadena = String.format("%s\t\t%s - Sueldo: %.2f - %s\n",cadena,
                    obtenerEnfermeros()[i].obtenerNombre(),
                    obtenerEnfermeros()[i].obtenerSueldo(),
                    obtenerEnfermeros()[i].obtenerTipo());
        }
        cadena = String.format("%s\nTotal de sueldos a pagar por mes: %.2f\n",
                cadena,obtenerSueldos());
        return cadena;
    }
    
}
