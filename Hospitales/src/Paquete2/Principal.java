
package Paquete2;
import java.util.Scanner;
import Paquete1.Enfermero;
import Paquete1.CiudadHospital;
import Paquete1.Hospitales;
import Paquete1.Medico;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreHos;
        double sueldoM;
        double sueldoE;
        String espe;
        int numEspe;
        String nciudad;
        String provincia;
        String estadoE;
        CiudadHospital ciudad;
        String nombreMedi;
        String nombreEnfer;
        int numMedi;
        int numEnfer;
        Medico [] medicosv;
        Enfermero[] enfermeros;
        String direccion;
        
        System.out.print("Ingrese el nombre del hospital: ");
        nombreHos = sc.nextLine();
        System.out.print("Ingrese la dirección del hospital: ");
        direccion = sc.nextLine();
        System.out.print("Ingrese la ciudad a la que pertenece el"
                    + " hospital: ");
        nciudad = sc.nextLine();
        System.out.printf("Ingrese la provincia a la que pertence el "
                    + "hospital: ");
        provincia = sc.nextLine();
        System.out.print("Ingrese el número de medicos: ");
        numMedi = sc.nextInt();
        System.out.print("Ingrese el número de enfermeros(as): ");
        numEnfer = sc.nextInt();
        System.out.print("Ingrese el número de especialidades: ");
        numEspe = sc.nextInt();
        
        sc.nextLine();
        System.out.println("");
        CiudadHospital ciu = new CiudadHospital(nciudad,provincia);
        ciu.establecerNombreCiudad(nciudad);
        ciu.establecerNombreProvincia(provincia);
        medicosv = new Medico[numMedi];
        enfermeros = new Enfermero[numEnfer];
        System.out.println("");
        
        for(int i = 0; i < numMedi; i++){
            System.out.printf("Ingrese el nombre del médico %s\n", i +1);
            nombreMedi = sc.nextLine();
            System.out.printf("Ingrese la especialidad del médico %s\n",i+1);
            espe = sc.nextLine();
            System.out.printf("Ingrese el sueldo del médico %d\n",i+1);
            sueldoM= sc.nextDouble();  
            sc.nextLine();
            Medico md = new Medico(nombreMedi,espe,sueldoM);
            medicosv[i]=md;
        }
        sc.nextLine();
        System.out.println("");
        for(int i = 0; i < numEnfer;i++){
            System.out.printf("Ingrese el nombre del enfermero(a) %s\n",i+1);
            nombreEnfer = sc.nextLine();
            System.out.printf("Ingrese el estado del enfermero(a)"
                    + "[nombramiento - contratado] %s\n",i+1);
            estadoE = sc.nextLine();
            System.out.printf("Ingrese el sueldo del enfermero(a) %d\n",i+1);
            sueldoE = sc.nextDouble(); 
            sc.nextLine();
            
            Enfermero ef = new Enfermero(nombreEnfer,estadoE,sueldoE);
            enfermeros[i]= ef;
        }
        sc.nextLine();
        System.out.println("");
        Hospitales hos = new Hospitales(nombreHos,ciu,numEspe,medicosv,
                enfermeros,direccion);
        hos.establecerSueldos();
        System.out.printf("\n%s\n", hos);
        
        
        
        
    }
    
    
    
}
