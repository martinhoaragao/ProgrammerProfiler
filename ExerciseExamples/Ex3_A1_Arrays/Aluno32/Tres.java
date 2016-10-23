import java.util.*;
/**
 * Questão nº 3 da Ficha 8 
 */
public class Tres {
	
	public static void main(String[] args) {
		int N, pares = 0;
		int[] vetor;
		Scanner s = new Scanner(System.in);	

		N = Integer.parseInt(args[0]);
		vetor = new int[N];

		for (int i=0; i < N; i++) {
			vetor[i] = s.nextInt();
			if (vetor[i] % 2 == 0) pares++;
		}

		System.out.println("Pares: " + pares);
	}
}
