package Suma;
import java.util.Scanner;
public class SumaMatrices{ public static void main(String[] args) {
       int m, n, i, j, a[][],b[][], c[][];
       Scanner bolsaPlastico=new Scanner(System.in);
        System.out.println("Prog. que suma 2 Matriz");
        System.out.println("Cuantas filas tendran las matrices? ");
        m=bolsaPlastico.nextInt();
        System.out.println("Cuantas Columnas tendran las matrices?");
        n=bolsaPlastico.nextInt();        
         a=new int [m][n];
         b=new int [m][n];
         c=new int [m][n];
         System.out.println("Captura de los elementos de la 1a matrix");
         for(i=0;i<m;i++){
             for(j=0;j<n;j++){
                 System.out.println("Dame elemento a("+i+","+j+")= ");
                 a[i][j]=bolsaPlastico.nextInt();
             }
         }
         System.out.println("Captura de los elementos de la 2a matrix");
         for(i=0;i<m;i++){
             for(j=0;j<n;j++){
                 System.out.println("Dame elemento b("+i+","+j+")= ");
                 b[i][j]=bolsaPlastico.nextInt();
             }
         }
         for(i=0;i<m;i++){
             for(j=0;j<n;j++){
                 
                 c[i][j]=a[i][j]+b[i][j];
             }
         }
            System.out.println("la matriz 1 es : ");
           for(i=0;i<m;i++){
             for(j=0;j<n;j++){
                 System.out.print("\t"+a[i][j]);
             }
               System.out.println("");
           }
           System.out.println("la matriz 2 es : ");
           for(i=0;i<m;i++){
             for(j=0;j<n;j++){
                 System.out.print("\t"+b[i][j]);
             }
               System.out.println("");
           }
        System.out.println("la matriz resultante es : ");
           for(i=0;i<m;i++){
             for(j=0;j<n;j++){
                 System.out.print("\t"+c[i][j]);
             }
               System.out.println("");
           }
    }
}
