import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            long n = sc.nextLong();
            System.out.println(sum(n));
        }
    }
    static long sum(long n)
    {
        if(n<12)
            return n;
        return Math.max(n, sum(n/2)+sum(n/3)+sum(n/4));
    }
}
