

import java.io.BufferedReader;
import java.io.InputStreamReader;

 class DoubleStrings {
	public static void main(String args[]) throws Exception
	 {
		 int testCase = 0;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				testCase = Integer.parseInt(br.readLine());
			long[] result=new long[testCase];
			for(int i=0;i<result.length;i++){
					result[i] = Long.parseLong(br.readLine());
			}
			for(int i=0;i<result.length;i++){
			if(result[i]%2==0)
				System.out.println(result[i]);
			else
			System.out.println(result[i]-1);
			}
			
	 }



}
