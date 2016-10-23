import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, pares, impares, soma_pares;

		num = -1;
		pares = impares = soma_pares = 0;

		do {
			if (input.hasNextInt())
				num = input.nextInt();
			else {
				String trash = input.next();
				System.out.println("Os dados inseridos não correspondem a um número inteiro!");
				continue;
			}

			if (num % 2 != 0)
				impares++;
			else {
				pares++;
				soma_pares += num;
			}

		} while(num != 0);
		pares--;

		System.out.println("Quantidade de pares: " + pares);
		System.out.println("Quantidade de ímpares: " + impares);
		System.out.println("Média de todos os números pares inseridos: " + ((double) soma_pares / pares));

		input.close();
	}
}
