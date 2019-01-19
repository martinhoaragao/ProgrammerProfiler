//package bytecoin;

import java.util.*;

class ByteCoin {
    static long profit(int n)
    {
        if(n/12>0){
            return profit(n/2)+profit(n/3)+profit(n/4);
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
        //long ans=profit(n);
        System.out.println(profit(sc.nextInt()));
        }while(sc.hasNextLong());
        
    }
    
}
