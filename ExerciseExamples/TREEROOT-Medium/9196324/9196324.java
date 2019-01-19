import java.io.*;
import java.util.*;

class TreeRoot{
	public static void main(String args[])throws Exception{
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t=Integer.parseInt(buff.readLine());
		
		while(t-->0){
			int sum1=0;
			int sum2=0;
			int n=Integer.parseInt(buff.readLine());
			for(int i=0;i<n;i++){
				st=new StringTokenizer(buff.readLine());
			
				sum1+=Integer.parseInt(st.nextToken());
				sum2+=Integer.parseInt(st.nextToken());
			}
			System.out.println(sum1-sum2);
		}
	}
}
