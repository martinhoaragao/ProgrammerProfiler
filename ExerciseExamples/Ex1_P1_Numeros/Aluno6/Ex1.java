

import java.util.Scanner;

public class Ex1
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=0, numImpares=0, numPares=0, somatorio=0;
        double media;
        System.out.println("Indique um inteiro: ");
        n = sc.nextInt();
        while(n!=0){
            if(n%2==0) numPares++;
            else numImpares++;
            somatorio+=n;
            System.out.println("Indique um inteiro: ");
            n = sc.nextInt();
        }
        media = somatorio/(numPares+numImpares);
        System.out.println("Num. de Impares = " + numImpares);
        System.out.println("Num. de Pares = " + numPares);
        System.out.println("Media = " + media);
    }
    
}
