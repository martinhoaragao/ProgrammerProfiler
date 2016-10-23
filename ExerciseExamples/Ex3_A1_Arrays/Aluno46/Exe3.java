

import java.lang.System.*;
import java.util.Scanner;

public class Exe3
{
    public static int main (){

        int pares, lido, i, n;
        int[] vetor;
        Scanner scanner = new Scanner(System.in);

        vetor = new int[4098];

        System.out.println("introduz quantas posições tem o vetor");
 		lido = scanner.nextInt();

 		pares = 0;

 		for(i=0 ; (lido > 0) && (i<4098); lido--, i++){
 			System.out.println("introduz um valor");
 			n = scanner.nextInt();
 			vetor[i] = n;
 			if((n & 1) == 0){
 				pares++;
 			}
 		}

 		System.out.println("pares = " + pares);

        return 0;
    }
}