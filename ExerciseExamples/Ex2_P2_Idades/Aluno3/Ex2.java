
/**
 * Escreva um programa Java que dado um número M e um nú-
 * mero N, inteiros positivos, lê N idades mostrando todas as idades
 * maiores que M. No final deve mostrar a média (numero real) das
 * idades lidas.
 */

import java.util.*;
public class Ex2{
    
   public static void main(int M, int N){
    int i, idade;
    int total=0;
    double media;
    Scanner input = new Scanner(System.in);
    List<Integer> idades = new ArrayList<Integer>();
    idade = input.nextInt();
    for (i=0; i<N; i++){
        if(idade>M)idades.add(idade);
        total+=idade;
        idade=input.nextInt();
    }
    media=total/N;
     
    Iterator it = idades.iterator();
    while(it.hasNext()){
        idade=(int)it.next();
        System.out.println(idade);
    }
    
    System.out.println("media: "+ media);

    }
   
}
