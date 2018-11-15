import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner readr = new Scanner(System.in);
        
        long n = 0;
        
        while(readr.hasNext()){
            n = readr.nextLong();
        
            System.out.println(getSum(n));
        }
        
    }

    private static long getSum(long n) {
        if(n < 12){
            return n;
        }
        
        else {
            return getSum(n/2)+getSum(n/3)+getSum(n/4);
        }
        
        
    }
    }