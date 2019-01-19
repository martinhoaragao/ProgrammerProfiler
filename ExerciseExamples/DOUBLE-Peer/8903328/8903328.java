import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DOUBLE {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[] ans = new int[t];
		for(int i=0;i<t;i++) {
			int num = Integer.parseInt(br.readLine());
			if(num%2 == 0) ans[i] = num;
			else ans[i] = ans[i] = num-1;
		}
		for(int i=0;i<t;i++)
			System.out.println(ans[i]);
	}
}
