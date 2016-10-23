
import java.io.*;
import java.util.*;
import java.lang.*;
public class Ex1
{
   public int ex1(){
    Scanner sc = new Scanner(System.in);
    int i = 1;
    int pares=0;
    int impares =0;
    int total_pares=0;
    int media;
    while(i!=0){
        i=sc.nextInt();
        if(i>0){
            if((i%2)==0){
                pares++;
                total_pares = total_pares + i;
    
            }
            else impares++;
        }   
    }
    media = total_pares / pares;
    System.out.println("Numero de impares : " + impares + " \n");
    System.out.println("Numero de pares   : " + pares + " \n");
    System.out.println("Media dos pares : " + media + " \n");
    return 0;
    
}
}
