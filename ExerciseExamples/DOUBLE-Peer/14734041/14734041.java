import java.util.*;
import java.lang.*;
class Program{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		while(a--!=0){
		long n=sc.nextLong();
		if(n%2==0)
			System.out.println(n);
		else
			System.out.println(n-1);
		}
	}
} 