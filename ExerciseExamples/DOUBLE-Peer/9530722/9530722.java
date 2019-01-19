import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bf.readLine());
		for(int i = 0; i < testCase; i++){
			int n = Integer.parseInt(bf.readLine());
			if(n == 0)
				System.out.println(0);
			else if((n%2)== 0)
				System.out.println(n);
			else
				System.out.println(n-1);
				
		}
		bf.close();
	}
}
