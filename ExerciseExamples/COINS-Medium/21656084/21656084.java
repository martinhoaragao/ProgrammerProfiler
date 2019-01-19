//CodeChef COINS
import java.util.Scanner;
public class Main{   
	public static void main (String[] args) throws java.lang.Exception{
	    Scanner s= new Scanner(System.in);
	    while(s.hasNext()){
	        long n=s.nextLong();
	        System.out.println(f(n));
	    }
	    s.close();
	}
	public static long f(long n){
        if(n<12) return n;
        return Math.max(n,f(n/2)+f(n/3)+f(n/4));
    }
}