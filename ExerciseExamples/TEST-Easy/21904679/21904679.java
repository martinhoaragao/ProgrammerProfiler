import java.awt.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner reader = new Scanner(System.in);
		int n;
		ArrayList<Integer> c = new ArrayList<Integer>();
		while((n = reader.nextInt()) != 42) {
			c.add(n);
		}
		for(int l : c) {
			System.out.println(l);
		}
		//once finished
		reader.close();
		
	}
}
