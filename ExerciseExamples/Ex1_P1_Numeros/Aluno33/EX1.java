
import java.util.Scanner;
import java.util.*;
public class EX1
{
    /* Escreva um programa Java que leia uma quantidade não determinada de números inteiros positivos (o número que encerrará a leitura será o zero). Calcule e imprima a quantidade de números pares e ímpares assim como a média (numero real) dos valores pares*/

    void media(){
        List <Integer> lista=new ArrayList<>();
        Scanner scan= new Scanner(System.in);
        int i;
        int pares=0;
        int impares=0;
        int sum=0;
        while((i=scan.nextInt())!=0){
            lista.add(i);

        }
        Iterator <Integer> it= lista.iterator();
        int temp;
        while(it.hasNext()){
         temp=it.next();
         if((temp%2)==0){pares++;}else{impares++;}
         sum+=temp;
        }
        double media=sum/(lista.size());
        System.out.println(pares+"números pares.");
        System.out.println(impares+"números ímpares.");
        System.out.println("Média:"+media);
    }

}
