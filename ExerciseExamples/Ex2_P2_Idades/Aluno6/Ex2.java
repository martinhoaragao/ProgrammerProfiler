

import java.util.Scanner; 
import java.io.*; 
import java.util.*;
public class Ex2
{
    public static void main(String[] args){
        int i, n=0, m, somatorio=0, j, id;
        boolean error=false;
        Scanner sc = new Scanner(System.in);
        do{
               try{ error=false; System.out.println("Indique quantas idades quer ler: "); n =  sc.nextInt();}
               catch(InputMismatchException e){sc.next(); System.out.println("Insira um número! "+e);error=true;}
            }
        while(error==true);
        int medias[] = new int[n];
        System.out.println("Superiores a: ");
        m = sc.nextInt();
        i = 0;
        j = 0;
        while(i!=n){
            System.out.println("Indique uma idade: ");
            id =  sc.nextInt();
            if(m<id) {
                medias[j] = id;
                j++;
            }
            somatorio += id;
            i++;
        }
        System.out.println("Idades superiores a: "+m);
        i=0;
        while(i!=j) {   
            System.out.println(medias[i]);
            i++;
        }
        System.out.println("Média: "+(double)somatorio/n);
    }
}
