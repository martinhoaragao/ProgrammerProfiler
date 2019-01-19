import java.util.*;
class cheak {
    static long maxCoin(long n){
        if(n<12) return n;
        else{
            return (maxCoin(n/2)+maxCoin(n/3)+maxCoin(n/4));
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int a=sc.nextInt();
        while(sc.hasNext()){
            System.out.println(maxCoin(sc.nextLong()));
    
    }
        
        
    }
    
}
