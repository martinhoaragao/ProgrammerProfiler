import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String s = br.readLine();
		int numberOfInput = Integer.parseInt(br.readLine());
		//System.out.println("s:"+s);
		//System.out.println("numberOfStrings:"+numberOfStrings);
		int[] palindromeLengthInput = new int[numberOfInput];
		//ABDOPQR
		
		int [] outputDoubleStringLength = new int[numberOfInput];
		
		for (int i = 0; i < numberOfInput; i++) {
			palindromeLengthInput[i] = Integer.parseInt(br.readLine());
			
			if(palindromeLengthInput[i]==0)
				outputDoubleStringLength[i]=0;
			else
			if(palindromeLengthInput[i]%2==0)
				outputDoubleStringLength[i]=palindromeLengthInput[i];
			else
				outputDoubleStringLength[i]=palindromeLengthInput[i]-1;
			
		}
		
		for (int i = 0; i < numberOfInput; i++) {
			System.out.println(outputDoubleStringLength[i]);
		}
		
		
		
		
	}

}
