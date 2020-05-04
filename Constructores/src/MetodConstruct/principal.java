/*Copyright (c) 2019 Boyzo Ramirez Carlos|©-Archivo Historico Digitalizado Charlie Ramirez Animation Studios de Mexico-Ing. Juan Gastaldi Perez.
UNIVERSIDAD NACIONAL AUTONOMA DE MEXICO-FACULTAD DE ESTUDIOS SUPERIORES ARAGON-INGENIERIA ELECTRICA ELECTRONICA.
Programa Metodos Constructores 1, Version 23 de Abril 2020. 
CODIGO BAJO "LICENCIA MIT". PARA CODIGO ABIERTO (OPEN SOURCE  https://opensource.org/licenses/MIT).
*/
package MetodConstruct;
import java.util.Scanner;
public class principal {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Dame tu nombre");
        String nom=teclado.nextLine();
        System.out.println("Dame tu edad");
        int ed=teclado.nextInt();
        System.out.println("Dame tu estatura");
        float talla=teclado.nextFloat();
        humanos persona1=new humanos(nom,ed,talla);
        persona1.mostrarDatos();
    }
    
}
