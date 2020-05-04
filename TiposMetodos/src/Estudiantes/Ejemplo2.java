/*Copyright (c) 2019 Boyzo Ramirez Carlos|©-Archivo Historico Digitalizado Charlie Ramirez Animation Studios de Mexico-Ing. Juan Gastaldi Perez.
UNIVERSIDAD NACIONAL AUTONOMA DE MEXICO-FACULTAD DE ESTUDIOS SUPERIORES ARAGON-INGENIERIA ELECTRICA ELECTRONICA.
Programa que calcula el promedio de cuatro calificaciones, Version 21 de Abril 2020. 
CODIGO BAJO "LICENCIA MIT". PARA CODIGO ABIERTO (OPEN SOURCE  https://opensource.org/licenses/MIT).
*/
package Estudiantes;
import java.util.Scanner;
public class Ejemplo2 {
    //metod que devuelven valor pero No param
    float calif1,calif2,calif3,calif4;
    public void leerCalificaciones(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Dame 1a Calificacion");
        calif1=teclado.nextFloat();
        System.out.println("Dame 2a Calificacion");
        calif2=teclado.nextFloat();
        System.out.println("Dame 3a Calificacion");
        calif3=teclado.nextFloat();
        System.out.println("Dame 4a Calificacion");
        calif4=teclado.nextFloat();
    }
    public float promedio(){
        float prom=(calif1+calif2+calif3+calif4)/4;
        return prom;
       
    }
    
}
