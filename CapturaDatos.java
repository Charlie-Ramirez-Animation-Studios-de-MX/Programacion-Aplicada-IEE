package paquete1;

import java.util.Scanner;

public class CapturaDatos {
    public static void main(String[] args) {
        int a;
        String nombre;
        
//a=10;
        Scanner caja=new Scanner(System.in);
        
        System.out.println("Dame un numero");
        a=caja.nextInt();
        
        System.out.println("Programa que captura datos por teclado");
        System.out.println("El valor del numero es: "+a);
        System.out.println("Dame tu nombre");
        caja.nextLine();
        nombre=caja.nextLine();
        System.out.println("Tu nombre es: " +nombre);
        
    }
    
}
