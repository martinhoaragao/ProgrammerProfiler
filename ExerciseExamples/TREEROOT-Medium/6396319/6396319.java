import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String input;
		BufferedReader br = 
                      new BufferedReader(new InputStreamReader(System.in));
		input = br.readLine();
		String[] IDS;
		
		int T = Integer.parseInt(input);
		
		
		while(--T >= 0){
			input = br.readLine();
			int N = Integer.parseInt(input);
			int sumIndexes=0;
			int sumTree=0;
			for(int i=0;i<N;i++){
				input = br.readLine();
				IDS = input.split(" ");
				sumIndexes += Integer.parseInt(IDS[0]);
				sumTree += Integer.parseInt(IDS[1]);			
			}
			
			int ID = sumIndexes - sumTree;
			
			
			System.out.println(Integer.toString(ID));
			
		}
		
		
		br.close();
	}
	
	
}
