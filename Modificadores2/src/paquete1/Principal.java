package paquete1;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Clase1 objeto1=new Clase1();
        Scanner teclado=new Scanner(System.in);
        System.out.println("CUal es tu edad ");
        int hedad=teclado.nextInt();
        System.out.println("dame tu nombre ");
        String nombre=teclado.nextLine();
        objeto1.setNombre(nombre);
        
        objeto1.SetEdad(hedad);
        int EDAD=objeto1.getEdad();
        String Nombre=objeto1.getNombre();
        
        System.out.println("La edad es "+EDAD);
    }
      
}
