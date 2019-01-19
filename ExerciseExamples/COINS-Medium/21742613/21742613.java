import java.util.*;
class Solution{
    public static long maxAmount(long n){
        if(n<=11)
            return n;
        return maxAmount(n/2)+maxAmount(n/3)+maxAmount(n/4);
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        
        while(in.hasNext()){
            int n=in.nextInt();
            System.out.println(maxAmount(n));
        }
    }
}