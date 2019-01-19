import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class atm {

	
	public static void main(String[] args) {

		float withdrawAmt = 0;
		float balance = 0.0f;
		float arr[] = new float[2];
		int i=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String data[] = br.readLine().split(" ");
			withdrawAmt = Integer.parseInt(data[0]);
			balance = Float.valueOf(data[1]);
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		

		if(withdrawAmt > 0 && withdrawAmt < 2000 && withdrawAmt %5 ==0){
			
			if(balance >=0 && balance <=2000 && (withdrawAmt+0.5f) <= balance)
			{
				balance =  (balance - withdrawAmt)-0.5f;
				
			}
		}
		
		System.out.println(balance);

	}

}
