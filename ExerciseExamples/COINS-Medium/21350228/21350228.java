import java.util.Scanner;
class GoldCoin{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
        
        while(sc.hasNextLong()){
        	long n=sc.nextLong();
			long coin=count(n);
			System.out.println(coin);
		
		}
		
	}
	static long count(long n){
		if(n<=11)
		   return n;		  
	  	 long len=count(n/2)+count(n/3)+count(n/4);	  	
	  	 return len;
	  
		
		
	}
}