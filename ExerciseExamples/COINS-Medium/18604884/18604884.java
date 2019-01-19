import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
 
public class Main{
	
	public static long getCoin(long n) {
		if(n<12)return n;
		 if(n/2 + n/3 + n/4 < n){
			 return n;
		  }
		
		return getCoin(n/2)+getCoin(n/3)+getCoin(n/4);
		
	}
	
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			long n= sc.nextLong();
			long aCoin = getCoin(n);
			System.out.println(aCoin);
		}
		
		sc.close();
	}
 
} 