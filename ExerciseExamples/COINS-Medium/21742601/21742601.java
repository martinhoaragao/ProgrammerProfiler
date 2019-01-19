import java.util.*;
class Solution{
    static HashMap<Long,Long> amount=new HashMap<>();
    public static long maxAmount(long n){
        if(n<=11)
            return n;
        if(!amount.containsKey(n)){
            long temp = maxAmount(n/2)+maxAmount(n/3)+maxAmount(n/4);
            amount.put(n,temp);
        }
        return amount.get(n);
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        
        while(in.hasNext()){
            int n=in.nextInt();
            System.out.println(maxAmount(n));
        }
    }
}