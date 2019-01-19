import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class Doubles {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		while(testcase>0){
			int len = Integer.parseInt(br.readLine());
			if(len%2==0)
				System.out.println(len);
			else
				System.out.println(len-1);
			testcase--;
		}
	}
} 