

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T,sum,childSum,N;
		T = Integer.parseInt(reader.readLine());
		String[] str;
		for(int i=0;i<T;i++){
			sum = 0;
			childSum = 0;
			N = Integer.parseInt(reader.readLine());
			for(int j=0;j<N;j++){
				str = reader.readLine().split(" ");
				sum+=Integer.parseInt(str[0]);
				childSum+=Integer.parseInt(str[1]);
			}
			System.out.println(sum-childSum);
		}
	}

}
