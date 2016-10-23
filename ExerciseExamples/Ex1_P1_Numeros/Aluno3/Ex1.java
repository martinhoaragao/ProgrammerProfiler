
/**
 * Escreva um programa Java que leia uma quantidade não de-
 * terminada de números inteiros positivos (o número que encer-
 * rará a leitura será o zero). Calcule e imprima a quantidade de
 * números pares e ímpares assim como a média (numero real)
 *dos valores pares.
 */

import java.util.*;
public class Ex1
{
   public static void main(){
    int i, numero;
    Scanner input = new Scanner(System.in);
    List<Integer> numeros = new ArrayList<Integer>();
    numero = input.nextInt();
    for (i=0; numero!=0; i++){
        numeros.add(numero);
        numero=input.nextInt();
    }
    Iterator it = numeros.iterator();
    int total=0;int numPares=0; int numImpares=0;
    double media;
    while(it.hasNext()){
        numero=(int)it.next();
        if (numero % 2 == 0){ numPares++; total+=numero;}
        else numImpares++;
    }
    media = total/numPares;
    System.out.println("pares: "+ numPares);
    System.out.println("impares: "+ numImpares);
    System.out.println("media dos pares: "+ media);
       
    }
   
}
