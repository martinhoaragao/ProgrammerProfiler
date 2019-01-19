import java.io.*;
import java.util.*;

class CodeChef{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while((t--)!=0){
			int n = s.nextInt();
			long sum=0,s2=0;
			for(int i=0;i<n;i++){
				int a =s.nextInt();
				int b=s.nextInt();
				s2+=a;
				sum+=b;
			}
			
			System.out.println(s2-sum);
		
		}
	
	}
}