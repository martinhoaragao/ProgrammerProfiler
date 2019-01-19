import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String []args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String temp = br.readLine();
		
		int t = Integer.parseInt(temp);
		
		while(t > 0) {
			
			temp = br.readLine();
			
			int n = Integer.parseInt(temp);
			
			if(n%2 == 0) System.out.println(n);
			else System.out.println(n-1);
			
			t--;
		}
		
	}
}