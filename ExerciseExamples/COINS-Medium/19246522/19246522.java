import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) {
		Scanner console = new Scanner(System.in);
		boolean exit = false;
		
		while(console.hasNext()) {
			long num = console.nextInt();
			//if(line.trim().isEmpty()) {
			//	exit = true;
			//} else {
				//long num = Integer.parseInt(line.trim());
				System.out.println(max(num));
			//}	
		}
	}
	
	public static long max(long n) {
		if((n/2 + n/3 + n/4) > n) {
			return max(n/2) + max(n/3) + max(n/4);
		}
		else {
			return n;
		}
	}
}
