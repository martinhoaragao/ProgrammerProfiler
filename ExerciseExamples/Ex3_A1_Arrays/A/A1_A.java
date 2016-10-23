import static java.lang.System.out;
import static java.lang.System.err;
import java.util.Scanner;

public class a1 {
	public static void main(String args[]) {
		int n,i,pares=0;
		String[] nums;
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos números terá o seu vetor?");
		n=input.nextInt();
		input.nextLine();
		if (n==0) {
			System.err.println("O vetor não pode ter 0 números.");
			return;
		}
		System.out.println("Introduza os números do vetor separados por espaços:");
		String aux=input.nextLine();
		nums=aux.split(" ");
		if(nums.length!=n) {
			System.err.println("O vetor não tem "+n+" números!");
			return;
		}
		for (i=0;i<n;i++) {
			if (((Integer.parseInt(nums[i]))%2)==0) pares++;
		}
		System.out.println("Existem "+pares+" números pares no vetor.");
	}
}
