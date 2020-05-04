/*Copyright (c) 2019 Boyzo Ramirez Carlos|©-Archivo Historico Digitalizado Charlie Ramirez Animation Studios de Mexico-Ing. Juan Gastaldi Perez.
UNIVERSIDAD NACIONAL AUTONOMA DE MEXICO-FACULTAD DE ESTUDIOS SUPERIORES ARAGON-INGENIERIA ELECTRICA ELECTRONICA.
Programa que calcula el promedio de cuatro calificaciones, Version 21 de Abril 2020. 
CODIGO BAJO "LICENCIA MIT". PARA CODIGO ABIERTO (OPEN SOURCE  https://opensource.org/licenses/MIT).
*/
package Estudiantes;
public class Ejemplo3 {
    //metod que no devuelven valor pero reciben param
    float calif1,calif2,calif3,calif4;
    public void asigneCalificaciones(float a,float b,float c,float d){
        calif1=a;
        calif2=b;
        calif3=c;
        calif4=d;
        
    }
    public float promedio(){
        float prom=(calif1+calif2+calif3+calif4)/4;
        return prom;
    }
    public void mostrarPromedio(float prom){
            System.out.println("el promedio de este alumno es: "+prom);
    }
}
