import java.util.Scanner;
class Solution{
    static long amount[];
    static int N=100000000;
    public static long maxAmount(int n){
        if(n<=N)
            return amount[n];
        else
            return maxAmount(n/2)+maxAmount(n/3)+maxAmount(n/4);
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        
        amount=new long[N+1];
        for(int i=0;i<=N;i++)
                amount[i]=(long)Math.max(i,amount[i/2]+amount[i/3]+amount[i/4]);
        
        while(in.hasNext()){
            int n=in.nextInt();
            System.out.println(maxAmount(n));
        }
    }
}