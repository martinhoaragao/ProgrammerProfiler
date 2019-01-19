import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Vector<Integer> array = new Vector<>();	
		int temporary;
		while(true) {
			temporary = s.nextInt();
			if(temporary == 42)
				break;
			array.add(temporary);
		}		
		for(int i=0; i < array.size(); i++) {
			if(array.get(i).equals("42"))
				break;
			System.out.println(array.get(i));
		}
	}
}
