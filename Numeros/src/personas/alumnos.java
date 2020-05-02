//©2020 Charlie-Ramirez-Animation-Studios-de-MX
package personas;
import java.util.Scanner;
public class alumnos {
    int edad;
    double estatura;
    int peso;
    String nombreB;
    String nombre;
    String CPiel;
    String Complex;
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        alumnos est1=new alumnos();
        est1.nombre="pepe ";
        est1.edad=20;
        est1.estatura=1.75;
        est1.peso=120;
        est1.CPiel="nigeriano";
        est1.Complex="Fat";
        System.out.println("Dime tu nombre ");
        est1.nombre=lectura.nextLine();
        System.out.println("mi nombre es: "+est1.nombre);
        System.out.println("mi edad es: "+est1.edad);
        System.out.println("mi Estatura es: "+est1.estatura);
        System.out.println("mi peso es: "+est1.peso);
        System.out.println("soy: "+est1.Complex);
        System.out.println("mi color de piel  es: " + est1.CPiel);
    }
    
}
