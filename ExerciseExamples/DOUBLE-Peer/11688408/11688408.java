import java.util.*;

class Pallindrome{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t!=0){
			long n=s.nextLong();
			if(n%2==0)
				System.out.println(n);
			else
				System.out.println(n-1);
			t--;	
		}
	
	}
}