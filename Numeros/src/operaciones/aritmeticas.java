//©2020 Charlie Ramirez Animation Studios de Mexico
package operaciones;
import java.util.Scanner;
public class aritmeticas {
    //Atrib
    int a, b;
    int sum;
    int res;
    int mult;
    int div;
    //Metod
    //pet or read
    public void lernms(){
        System.out.println("Dame 1er num");
        Scanner cj=new Scanner(System.in);
        a=cj.nextInt();
        System.out.println("Dame 2do num");
        b=cj.nextInt();
        System.out.println("Com. calc");
                
    }
    //Metod sum
    public void SumNum() {
        sum=a+b;      
    }//Metod res
     public void ResNum() {
        res=a-b;      
    } //Metod mult
     public void MulNum() {
        mult=a*b;      
    }  //Metod div
      public void DivNum() {
        div=a/b;      
    }
     //metod Print
      public void PrintRes() {
          System.out.println("Resultados Son");
          System.out.println("Suma es:"+sum);
          System.out.println("Resta es:"+res);
          System.out.println("Mult es:"+mult);
          System.out.println("Div es:"+div);
          System.out.println("ready?\n va");
        
    }
}
