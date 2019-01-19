import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            int n=sc.nextInt();
            System.out.println(value(n));
        }


    }
    static long[] arr = new long[100000000];
    static long value(long n){
        if(n<=11)
            return n;
        if(n<100000000){
            if(arr[(int)n]!= 0){
                return arr[(int)n];
            }
            arr[(int)n] = Math.max(n, (value(n/2) +value(n/3)+value(n/4)));
            return arr[(int)n];
        }
        return Math.max(n, (value(n/2) +value(n/3)+value(n/4)));

    }

}
