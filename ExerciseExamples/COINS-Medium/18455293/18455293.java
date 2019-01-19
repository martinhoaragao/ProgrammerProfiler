import java.util.Scanner;


public class Main {
    public static long solve(long x){
        long sum = x/2+x/3+x/4;
        if(sum>x)
             return solve(x/2)+solve(x/4)+solve(x/3);
        else
          return x;
    }
    public static void main(String arg[]){
        
        Scanner s = new Scanner(System.in);
        
        while(s.hasNextInt()){
            long x= s.nextLong();
            
            System.out.println(solve(x));
        }
     
    }
    
}