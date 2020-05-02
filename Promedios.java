package Promedios;

import java.util.Scanner;

public class Promedios {
    public static void main(String[] args) {
        int n, i;
        float suma, prom, cal[];
        Scanner teclado=new Scanner(System.in);
        System.out.println("Progarama que calcula promedios");
        System.out.println("Cuantas vas a promediar: ");
       n=teclado.nextInt();
       cal=new float[n+1];
       for(i=1;i<=n;i++){
           System.out.println("Dame la "+i+" calificacion: ");
           cal[i]=teclado.nextFloat();
       }
       suma=0;
                for(i=1;i<=n;i++){
           suma=suma+cal[i];
       }
                prom=suma/n;
                System.out.println("las calificaciones que me diste son");
                for(i=1;i<=n;i++)
                System.out.println("\t\t"+cal[i]);
        System.out.println("El promedio Es: "+prom);
    }
    
    
}
