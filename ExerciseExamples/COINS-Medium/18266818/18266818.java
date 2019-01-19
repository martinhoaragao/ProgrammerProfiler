
import java.util.*;

public class Main {

	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		long n=-1;
		while(sc.hasNextInt()){
			n=sc.nextLong();
			
			System.out.println(change(n));
		}
	}

	public static long change(long n) {
		
		long a=n/2;
		long b=n/3;
		long c=n/4;
		if(n<12){
			return n;
		}
		if(a+b+c>n){
			return change(n/2)+change(n/3)+change(n/4);
		}else{
			return n;
		}
	}
}
