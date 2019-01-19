
import java.util.*;

class Solver {
    public static int memory[]=new int[500000];
    public static long t;
    public static long doStuff(long  n)
    {
        if (n <= 500000)
            if (memory[(int)n] != 0)
                return memory[(int)n];

        if ((n/2)+(n/3)+(n/4) <= n)
            return n;
        else
        {
            t = doStuff(n/2)+doStuff(n/3)+doStuff(n/4);
            if (n<=500000)
                memory[(int)n]=(int)t;
            return t;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            long x=sc.nextInt();
            System.out.println(doStuff(x));
        }

    }
}
