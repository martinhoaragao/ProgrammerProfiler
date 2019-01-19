import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Ps {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T!=0){
			long  s  = Long.parseLong(br.readLine());
			if(s%2==0){
				System.out.println(s);
			}
			else{
				System.out.println(s-1);
			}
			
			T--;
		}
		
	}

}