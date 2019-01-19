import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
   
        Scanner s = new Scanner(System.in);
        
        while(s.hasNext()){
            long n=s.nextInt();
            long ans=moneycounter(n);
            System.out.println(ans);
        }
    }
    
    public static long moneycounter(long n){
        long a=n/2;
        long b=n/3;
        long c=n/4;
        if((a+b+c)<=n) return n;
        else return moneycounter(a)+moneycounter(b)+moneycounter(c);
    }
}