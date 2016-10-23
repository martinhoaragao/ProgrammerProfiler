import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, i = 0, soma = 0;

		if (args.length != 2) {
			System.out.println("Número de argumentos inválido!");
			return;
		}

		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);

		while(i < n) {
			if (input.hasNextInt())
				num = input.nextInt();
			else {
				String trash= input.next();
				System.out.println("Os dados inseridos não correspondem a um número inteiro!");
				continue;
			}

			if (num > m)
				System.out.println(num);

			soma += num;
			i++;
		}

		System.out.println("A média das idades lidas é " + ((double) soma / n));
	}
}
