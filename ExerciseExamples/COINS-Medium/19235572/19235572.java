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
    static long value(long n)
    {
        if(n<=11)
            return n;
        else
            return Math.max(n,(value(n/2))+value(n/3)+value(n/4));
    }

}
