import static java.lang.System.out;
import static java.lang.System.err;
import java.util.Scanner;

public class p2 {
	public static void main(String args[]){
		int m = Integer.parseInt(args[0]), n=Integer.parseInt(args[1]),i,aux;
		float media=0.0f;
		String in; String[] nums;
		Scanner input = new Scanner(System.in);
		if (m <= 0 || n <=0) {
			System.err.println("Ambos os números têm de ser inteiros positivos.");
			return;
		}
		System.out.println("Introduza as idades separadas por espaços.");
		in = input.nextLine();
		nums=in.split(" ");
		if (nums.length!=n) {
			System.err.println("Tem de introduzir "+n+" idades.");
			return;
		}
		System.out.printf("Idades maiores do que %d:\n",m);
		for(i=0;i<n;i++) {
			aux=Integer.parseInt(nums[i]);
			if (aux>m) System.out.println(aux);
			media+=aux;
		}
		System.out.println("Média: "+media/n);
	}
}
