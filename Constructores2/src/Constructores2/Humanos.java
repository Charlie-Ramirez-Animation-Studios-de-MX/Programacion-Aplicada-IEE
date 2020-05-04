/*Copyright (c) 2019 Boyzo Ramirez Carlos|©-Archivo Historico Digitalizado Charlie Ramirez Animation Studios de Mexico-Ing. Juan Gastaldi Perez.
UNIVERSIDAD NACIONAL AUTONOMA DE MEXICO-FACULTAD DE ESTUDIOS SUPERIORES ARAGON-INGENIERIA ELECTRICA ELECTRONICA.
Programa Metodos Constructores 2, Version 23 de Abril 2020. 
CODIGO BAJO "LICENCIA MIT". PARA CODIGO ABIERTO (OPEN SOURCE  https://opensource.org/licenses/MIT).
*/
package Constructores2;
public class Humanos {
    //atrib
    String nombre;
    int edad;
    float estatura;
    String curp;
    
    //metodo
    //metod construc paramet

    public Humanos(String curp) {
        this.curp = curp;
    }

    public Humanos(String nombre, int edad, float estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    Humanos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void nadar(){
        System.out.println("Soy "+nombre+" tengo "+edad+" años y mido "+estatura+" metros");
    }
    public void nadar(int km){
        System.out.println("Yo nado "+km+" kilometros diarios");
        System.out.println("Mi curp es "+curp);   
    }
}
