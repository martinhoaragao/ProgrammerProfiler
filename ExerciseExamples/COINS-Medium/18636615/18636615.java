import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= 10;
        while(t-->0)
        {
            long n = sc.nextLong();
            long ans = solution(n);
            System.out.println(ans);
        }
    }
    public static long solution(long n)
{
    long k = n/2 + n/3 + n/4;
    if(k>n)
        return solution(n/3) + solution(n/2) + solution(n/4);
    else return n;
}

}
