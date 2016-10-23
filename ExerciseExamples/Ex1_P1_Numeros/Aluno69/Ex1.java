
import java.util.Scanner;
public class Ex1
{
    public static void main(String[] args){
        int par = 0, impar = 0, media = 0, a=1;
        
        while(a!=0){
            Scanner ler= new Scanner (System.in);
            System.out.println("Introduza número.");
            a= ler.nextInt();
            if(a!=0){
                if(a%2==0) {par++; media = media+a;}
                else impar++;
            }
        }
        System.out.println("N pares: "+par+"\n N impares: "+impar+"\n Media: "+(media/par)+"\n");
   }
}
