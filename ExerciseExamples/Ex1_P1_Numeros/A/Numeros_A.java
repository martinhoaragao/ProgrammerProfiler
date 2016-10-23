import static java.lang.System.out;
import static java.lang.System.err;
import java.lang.Integer;
 
public class p1 {

	public static void main (String args[]) {
		int i,pares=0,impares=0,n;
		float media=0.0f;
		for (i=0;(n=(Integer.parseInt(args[i])))>0;i++) {
			if (n%2==0) pares++;
			else impares++;
			media+=n;
		}
		if (n==0) {
			media = media/i;
			System.out.println("Números pares: "+pares);
			System.out.println("Números ímpares: "+impares);
			System.out.println("Média: "+media);
		}
		else System.err.println("Número "+n+" inválido!");
	}
}
