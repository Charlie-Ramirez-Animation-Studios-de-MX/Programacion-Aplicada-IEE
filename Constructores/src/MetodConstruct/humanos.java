/*Copyright (c) 2019 Boyzo Ramirez Carlos|©-Archivo Historico Digitalizado Charlie Ramirez Animation Studios de Mexico-Ing. Juan Gastaldi Perez.
UNIVERSIDAD NACIONAL AUTONOMA DE MEXICO-FACULTAD DE ESTUDIOS SUPERIORES ARAGON-INGENIERIA ELECTRICA ELECTRONICA.
Programa Metodos Constructores 1, Version 23 de Abril 2020. 
CODIGO BAJO "LICENCIA MIT". PARA CODIGO ABIERTO (OPEN SOURCE  https://opensource.org/licenses/MIT).
*/
package MetodConstruct;
public class humanos {
    //atrib
    String nombre;
    int edad;
    float estatura;
    String curp;
    
    /*metod
    metod constructor
    caracteristics
        1-mismo nombre de clase
        2-no devuelve valores
        3-debe declararse publico*/
    public humanos(){
        
    }
    public humanos(String nombre,int edad,float estatura){
        this.nombre=nombre; //inicializo atribb->valor a nomb,ed,estat.
        this.edad=edad;
        this.estatura=estatura;
        
        
    }
    
    public void mostrarDatos(){
        System.out.println("mi nombre es "+nombre);
        System.out.println("mi edad es "+edad);
        System.out.println("mi estatura es "+estatura);
        
    }
            
            
    
}
