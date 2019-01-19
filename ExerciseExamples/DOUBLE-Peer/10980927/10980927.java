import java.io.*;

class DOUBLE{
	public static void main(String args[])throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(in.readLine());
		long number;
		for(int i=1;i<=t;i++){
			number=Long.parseLong(in.readLine());
			if(number%2l==0){
				System.out.println(number);
			}
			else{
				System.out.println(number-1l);
			}
		}
	}
}