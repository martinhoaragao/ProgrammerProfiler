
import java.util.Scanner;


public class Main {

    long exchange (long n){
        if (n/2 + n/3 + n/4 > n) {
            return  exchange(n/2) + exchange(n/3) + exchange(n/4);
        } else 
            return n;
        
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long temp;
        Main obj = new Main();
        while (s.hasNext()){
            temp=s.nextLong();
            System.out.println(obj.exchange(temp));
        }
    }
}
    

