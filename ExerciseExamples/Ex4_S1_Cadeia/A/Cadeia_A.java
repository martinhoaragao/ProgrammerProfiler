import static java.lang.System.out;
import static java.lang.System.err;
import java.lang.String;

public class s1 {
	public static void main(String args[]) {
		String cadeia_1 = args[0];
		String cadeia_2 = args[1];
		String aux;
		int i,j, tam_1=cadeia_1.length(), tam_2=cadeia_2.length(), count=0;
		if (tam_1 > tam_2) {
			System.err.println("A primeira cadeia tem de ter um comprimento menor ou igual à segunda cadeia.");
			return;
		}
		for(i=0;i<tam_2-tam_1;i++) {
			aux=cadeia_2.substring(i,i+tam_1);
			if(cadeia_1.equals(aux)) count++;
		}
		System.out.println("A subcadeia de caracteres "+cadeia_1+" surge "+count+" vezes na cadeia "+cadeia_2+".");
	}
}
