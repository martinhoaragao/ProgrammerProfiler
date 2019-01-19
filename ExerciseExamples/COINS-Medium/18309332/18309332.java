
import java.util.Scanner;


class Bytelandian {
    public static long count(long n){
        long a=n/2;
        long b=n/3;
        long c=n/4;
        long num=0;
        if(a+b+c>n)
            num=count(a)+count(b)+count(c);
        else if(a+b+c<n) num=n;
        else num=a+b+c;
        return num;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            long n=sc.nextLong();
            System.out.println(count(n));
        }
    }
}
