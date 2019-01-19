import java.util.Scanner;

class Coins{

	static long exchange (long n) {
            long sum = (n/2) + (n/3) + (n/4);
            if(sum>n) return exchange(n/2) + exchange(n/3) + exchange(n/4);
            else return n;
	}

     public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while(in.hasNextLong()) {
            
            System.out.println(exchange(in.nextLong()));
   
            
        }
     }
}