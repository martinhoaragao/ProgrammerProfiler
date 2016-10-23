import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(args[0]);
		int[] data = new int[n];
		int num, pares = 0, i = 0;

		while(i < n) { 
			if (input.hasNextInt())
				num = input.nextInt();
			else {
				String trash = input.next();
				System.out.println("Os dados inseridos não correspondem a um número inteiro!");
				continue;
			}

			if (num % 2 == 0)
				pares++;

			data[i] = num;
			i++;
		}

		System.out.println("Quantidade de pares lidos: " + pares);
	}
}
