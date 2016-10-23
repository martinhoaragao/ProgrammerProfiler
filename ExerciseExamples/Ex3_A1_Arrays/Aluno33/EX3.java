
import java.util.Scanner;
public class EX3
{
   /*Escreva um programa Java que, dado um número inteiro N
maior que 0, leia um vector (array unidimensionnal) de N elementos
inteiros e imprima quantos valores pares existem no vector. */


 int pares(int n){
    int [] lista=new int [n] ;
    Scanner scan= new Scanner(System.in);
    int pares=0;
    int count=0;
    //Construção do array (podia ter feito com List, e depois toArray())
    while(count!=n){
    lista[count]=scan.nextInt();
    count++;  
    }
    
    for(int i=0;i<n-1;i++){
    if((lista[i]%2==0)&&(lista[i+1]%2==0)){pares++;}
    }
    
    
    return pares;
    }


}
