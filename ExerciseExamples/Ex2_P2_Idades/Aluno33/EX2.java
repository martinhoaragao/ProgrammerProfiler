
import java.util.*;
public class EX2
{
    /*. Escreva um programa Java que dado um número M e um nú-
    mero N, inteiros positivos, lê N idades mostrando todas as idades
    maiores que M. No final deve mostrar a média (numero real) das
    idades lidas */

    void idades(int m,int n){
    Scanner scan= new Scanner(System.in);
    List <Integer> lista=new ArrayList<>();
    int ciclo=0;
    int soma=0;
    int maiores=0;
    int temp=0;
    while(ciclo!=n){
      temp=scan.nextInt();
      if(temp>m){lista.add(temp);}
      soma+=temp;
      ciclo++;
    }
    Iterator <Integer> it= lista.iterator();
    while(it.hasNext()){
    System.out.println(it.next());
    }
    double media=soma/n;
    System.out.println("Média:"+media);

    }

}
