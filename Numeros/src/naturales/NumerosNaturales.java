//©2020 Charlie-Ramirez-Animation-Studios-de-MX
package naturales;
public class NumerosNaturales {
    String signo;
    String color;
    String tamanio;
    int Cantidad;
    public static void main(String[] args) {
        NumerosNaturales num1=new NumerosNaturales();
        NumerosNaturales num2=new NumerosNaturales();
        NumerosNaturales juan=new NumerosNaturales();
        num1.signo="positivo ";
        num1.tamanio="infinito";
        num1.color="negro";
        num1.Cantidad=5555;
        num2.signo="negativos";
        juan.Cantidad=17;
        System.out.println("los numeros naturales tienen las propiedades: ");
        System.out.println("Todos son de signo: "+num1.signo);
        System.out.println("Son de tamaño: "+num1.tamanio);
        System.out.println("Todos son de color: "+num1.color);
        System.out.println("Y yo tengo el total: "+num1.Cantidad+" .numeros");
        System.out.println("El segundo ejemplo tiene signo: "+num2.signo);
        System.out.println("La edad de juan es: "+juan.Cantidad);
    }
}
