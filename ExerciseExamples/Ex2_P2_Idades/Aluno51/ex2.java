import java.util.Scanner;

public class ex2
{
   public static void ler (int m, int n){
       int i,total=0;
       int idades[]= new int[n];
       Scanner io = new Scanner(System.in);
       System.out.println("Insira " + n + " inteiros");
       for(i=0;i<n;i++){
           idades[i]=io.nextInt();
           total+=idades[i];
       }
       
       for(i=0;i<n;i++){
           if(idades[i]>m){
                System.out.println("Idade: " + idades[i]);
            }
       }
       System.out.println("Media: " + total/n);
   }
}
