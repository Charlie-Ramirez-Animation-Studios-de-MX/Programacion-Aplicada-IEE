/*Copyright (c) 2019 Boyzo Ramirez Carlos|©-Archivo Historico Digitalizado Charlie Ramirez Animation Studios de Mexico-Ing. Juan Gastaldi Perez.
UNIVERSIDAD NACIONAL AUTONOMA DE MEXICO-FACULTAD DE ESTUDIOS SUPERIORES ARAGON-INGENIERIA ELECTRICA ELECTRONICA.
Programa que calcula el promedio de cuatro calificaciones, Version 21 de Abril 2020. 
CODIGO BAJO "LICENCIA MIT". PARA CODIGO ABIERTO (OPEN SOURCE  https://opensource.org/licenses/MIT).
*/
package Estudiantes;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Programa que calcula el promedio de cuatro calificaciones");
        /*
        Ejemplo1 juan=new Ejemplo1();
        //leer calif de juan
        System.out.println("Dame las calificaciones de juan");
        juan.leerCalificaciones();
        System.out.println("El promedio de juan es: ");
        juan.calculopromedio();
        */
        
        /*
        Ejemplo2 juan=new Ejemplo2();
        System.out.println("dame las calificaciones de juan");
        juan.leerCalificaciones();
        System.out.println("el promedio de juan es");
        float excelenteprom=juan.promedio();
        System.out.println(excelenteprom);
        */
        
       /*
        Ejemplo3 juan=new Ejemplo3();
        System.out.println("dame las calificaciones de juan");
        Scanner teclado=new Scanner(System.in);
        System.out.println("Dame 1a Calificacion");
        float uno=teclado.nextFloat();
        System.out.println("Dame 2a Calificacion");
        float dos=teclado.nextFloat();
        System.out.println("Dame 3a Calificacion");
        float tres=teclado.nextFloat();
        System.out.println("Dame 4a Calificacion");
        float cuatro=teclado.nextFloat();
         juan.asigneCalificaciones(uno, dos, tres, cuatro);
         float Prom=juan.promedio();
         juan.mostrarPromedio(Prom);
        */
       
       Ejemplo4 juan=new Ejemplo4();
       System.out.println("dame las calificaciones de juan");
        Scanner teclado=new Scanner(System.in);
        System.out.println("Dame 1a Calificacion");
        float uno=teclado.nextFloat();
        System.out.println("Dame 2a Calificacion");
        float dos=teclado.nextFloat();
        System.out.println("Dame 3a Calificacion");
        float tres=teclado.nextFloat();
        System.out.println("Dame 4a Calificacion");
        float cuatro=teclado.nextFloat();
        juan.calculaPromedio(uno,dos,tres,cuatro);
        float Promedio=juan.calculaPromedio(uno,dos,tres,cuatro);
        System.out.println("El promedio de juan es: "+Promedio);
    }
    
}
