import java.io.*;
class Solution{
	public static void main(String[] args)throws IOException{
		int x;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			x = Integer.parseInt(br.readLine());
			if( x == 42){
				break;
			}
			else
			System.out.println(x);
		}
		br.close();
	}
}
