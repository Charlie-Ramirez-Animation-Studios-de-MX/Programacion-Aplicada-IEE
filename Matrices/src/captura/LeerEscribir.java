package captura;
import java.util.Scanner;
public class LeerEscribir {
    public static void main(String[] args) {
       int m, n,i, j, a[][];
       Scanner bolsaPlastico=new Scanner(System.in);
        System.out.println("Prog. que Capt. e Imp. a Matriz");
        System.out.println("Cuantas filas? ");
        m=bolsaPlastico.nextInt();
        System.out.println("Cuantas Columnas");
        n=bolsaPlastico.nextInt();        
         a=new int [m][n];
         System.out.println("Captura de elementos");
         for(i=0;i<m;i++){
             for(j=0;j<n;j++){
                 System.out.println("Dame elemento a("+i+","+j+")= ");
                 a[i][j]=bolsaPlastico.nextInt();
             }
         }
        System.out.println("la matriz que me diste es: ");
           for(i=0;i<m;i++){
             for(j=0;j<n;j++){
                 System.out.print("\t"+a[i][j]);
             }
               System.out.println("");
           }
    }
    
 
}
