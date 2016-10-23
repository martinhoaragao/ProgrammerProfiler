import java.util.*;

public class Um {
	
	public static void main() {
		int pares = 0, impares = 0, x, num = 0;
		double media = 0;
		Scanner s = new Scanner(System.in);

		System.out.println("===== Um ~ Maraville =====\n");

		do {
			x = s.nextInt();
			if (x % 2 == 0) pares++;
			else impares++;
			
			media += x;
			num++;
		} while(x != 0);

		System.out.println("Pares: " + pares + "\n");
		System.out.println("Impares: " + impares + "\n");
		System.out.println("Média: " + media/num + "\n");
	}

}
