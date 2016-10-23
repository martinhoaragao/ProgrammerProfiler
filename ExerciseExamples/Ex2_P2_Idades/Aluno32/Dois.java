import java.util.*;
/**
 * Questão nº 2 da Ficha 8 
 * 
 */
public class Dois {
	
	public static void main(String[] args) {

		int M, N, x;
		double media = 0;
		Scanner s = new Scanner(System.in);

		M = Integer.parseInt(args[0]);
		N = Integer.parseInt(args[1]);

	System.out.println(" ===== Dois ~ Maraville ==== ");

		for (int i=0; i < N; i++) {
			x = s.nextInt();
			
			if (x > M) System.out.println("Maior!");

			media += x;
		}

		System.out.println("Média: " + media / N);
	}

}
