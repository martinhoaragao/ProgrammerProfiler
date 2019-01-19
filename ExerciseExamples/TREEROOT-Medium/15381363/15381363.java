import java.io.*;
import java.util.*;
class Test{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0){
			int a,b,x,sum=0;
			x=sc.nextInt();
			while(x-->0){
				a=sc.nextInt();
				b=sc.nextInt();
				sum+=(a-b);
			}
			System.out.println(sum);
		}
	}
}