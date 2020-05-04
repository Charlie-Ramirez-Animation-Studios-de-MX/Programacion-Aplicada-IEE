/*Copyright (c) 2019 Boyzo Ramirez Carlos|©-Archivo Historico Digitalizado Charlie Ramirez Animation Studios de Mexico-Ing. Juan Gastaldi Perez.
UNIVERSIDAD NACIONAL AUTONOMA DE MEXICO-FACULTAD DE ESTUDIOS SUPERIORES ARAGON-INGENIERIA ELECTRICA ELECTRONICA.
Programa de Operaciones Matematicas Basicas, Version 16 de Abril 2020. 
CODIGO BAJO "LICENCIA MIT". PARA CODIGO ABIERTO (OPEN SOURCE  https://opensource.org/licenses/MIT).
*/
public class Operaciones {
int a;
int b;
int suma;
int resta;
int multiplica;
float divide;

//metod
public int sumar(int a, int b){
    suma=a+b;
    return suma;
}
public int restar(int a, int b){
    resta=a-b;
    return resta;
}
public int multiplicar(int a, int b){
    multiplica=a*b;
    return multiplica;
}
public float dividir(int a, int b){
    divide=((float)a/(float)b);
    return divide;
}
public void resultados(int adicion,int diferencia, int producto,float cociente){
    //suma=adicion
    resta=diferencia;
    multiplica=producto;
    divide=cociente;
    System.out.println("la suma de los numeros es: "+suma);
    System.out.println("la resta de los numeros es: "+resta);
    System.out.println("la multiplicacion es igual a: "+multiplica);
    System.out.println("la division de los numeros es: "+divide);
    
}

}