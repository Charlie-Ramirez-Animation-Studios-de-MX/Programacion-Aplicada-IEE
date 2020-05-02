/*Copyright (c) 2019 Boyzo Ramirez Carlos|©-Archivo Historico Digitalizado Charlie Ramirez Animation Studios de Mexico-Ing. Juan Gastaldi Perez.
UNIVERSIDAD NACIONAL AUTONOMA DE MEXICO-FACULTAD DE ESTUDIOS SUPERIORES ARAGON-INGENIERIA ELECTRICA ELECTRONICA.
Programa de Operaciones Matematicas Basicas, Version 16 de Abril 2020. 
CODIGO BAJO "LICENCIA MIT". PARA CODIGO ABIERTO (OPEN SOURCE  https://opensource.org/licenses/MIT).
*/
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Operaciones opera=new Operaciones();
        Scanner teclado=new Scanner(System.in);
        //opera.resultados
        System.out.println("Prog. de op. basics,  De la Clase En linea Prog. App. 16 ABR 2020 IEE FES ARAGON UNAM");
        System.out.println("Para comenzar");
        System.out.println("Dame el 1er num:");
        int num1=teclado.nextInt();
        System.out.println("Vale...");
        System.out.println("Dame el 2° num:");
        int num2=teclado.nextInt();
        int zuma=opera.sumar(num1,num2);
        int rresta=opera.restar(num1,num2);
        int Multiplica=opera.multiplicar(num1,num2);
        float divicion=opera.dividir(num1,num2);
        //opera.resultados();
        opera.resultados(zuma,rresta,Multiplica,divicion);
        
        
        
        //opera.sumar(0,0);
    }
    
}
