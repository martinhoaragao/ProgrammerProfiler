

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class DOUBLE {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		
		Integer tc = Integer.valueOf(br.readLine().trim());
		for(int i=0;i<tc;i++){
			Long s = Long.valueOf(br.readLine().trim());
			int x=0;
			s /= 2;
			s *= 2;
			System.out.println(s);
		}

	}

}
