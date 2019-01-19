
import java.io.*;
import java.util.Scanner;
 
class COINS {
    public static long ans(long num){
        long sum = num/2 + num/3 + num/4;
       if(sum>num)
         return ans(num/2)+ans(num/3)+ans(num/4);
		
	else
	return num;
    }
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		do{
		    long num = sc.nextLong();
		    System.out.println(ans(num));
		}while(sc.hasNextLong());
	
		
	}
} 