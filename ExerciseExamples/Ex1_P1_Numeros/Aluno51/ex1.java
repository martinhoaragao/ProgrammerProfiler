import java.util.Scanner;


public class ex1
{
   public static void ler (){
       Scanner io = new Scanner(System.in);
       int sum=0,par=0,impar=0,n=1;
       
       while(n!=0){
          n = io.nextInt(); 
          if(n!=0){
              if(n%2==0) {par++; sum+=n;}
              else impar++;
          }
       }
       System.out.println("Par: "+par);
       System.out.println("Imar: "+impar);
       System.out.println("Media Par: "+sum/par);
    }
}
