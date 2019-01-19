import java.io.*;
class Solution{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		int w = Integer.parseInt(str[0]);
		double balance = Double.parseDouble(str[1]);
		if(w%5 == 0 && balance - w -0.50 >=0){
			balance = balance - w;
			balance = balance - 0.50;
		}

		System.out.println(balance);
	}
}