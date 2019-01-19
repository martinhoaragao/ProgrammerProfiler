import java.io.*;

class Holes{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test  = Integer.parseInt(br.readLine());
		while(test-->0){
			String str = br.readLine();
			str = str.toUpperCase();
			int count = 0;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)=='B')
					count += 2;
				else if(str.charAt(i)=='A' || str.charAt(i)=='D' || str.charAt(i)=='O' || str.charAt(i)=='P' || str.charAt(i)=='Q' || str.charAt(i)=='R')
					count += 1;
				else
					count += 0;
			}
			System.out.println(count);
		}
	}
 	
}