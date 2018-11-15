//package codechef.codechef.hard.orders;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    private static InputStream getStream() {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        //return classloader.getResourceAsStream("test.txt");
        return classloader.getResourceAsStream("codechef.hard.orders/testcases.txt");
    }

    public static void main(String[] args) {
       // new Main().run(getStream());
       new Main().run(System.in);
    }

    private void run(InputStream stream) {
        Scanner scanner = new Scanner(new InputStreamReader(stream));

        runTestCases(scanner);
    }

    private void runTestCases(Scanner scanner) {
        int numberOfTestCases = scanner.nextInt();

        while (numberOfTestCases-- != 0) {
            runTestCase(scanner);
        }
    }

    private void spitArr(int[] data) {
        System.out.print(data[0]);
        for (int i = 1; i < data.length; i++) {
            System.out.print(' ');
            System.out.print((data[i]));
        }

        System.out.println();
    }

    void build(int[] v, int node,int a,int b)
    {
        if(a==b)
            v[node]=1;
        else
        {
            int mid=(a+b)/2;
            build(v,2*node,a,mid);
            build(v,2*node+1,mid+1,b);
            v[node]=b-a+1;
        }
    }

    private void runTestCase(Scanner scanner) {
        int[] soldiersShifts = new int[scanner.nextInt()];

        for (int i = 0; i < soldiersShifts.length; i++) {
            soldiersShifts[i] = scanner.nextInt();
        }

        spitArr(inferRanks(soldiersShifts));
    }

    private int qqq(int[] v, int node, int pos, int a, int b)
    {
        if(a==b)
        {
            --v[node];
            return a;
        }
        else
        {
            int mid=(a+b)/2;
            --v[node];
            if(pos<=v[2*node])
                return qqq(v,2*node,pos,a,mid);
            else
                return qqq(v,2*node+1,pos-v[2*node],mid+1,b);
        }
    }

    private int[] v = new int[1000000];

    private int[] inferRanks(int[] soldiersShifts) {
        build(v, 1, 1, soldiersShifts.length);
        //spitArr(v);

        int[] ans = new int[soldiersShifts.length];

        for(int i = soldiersShifts.length - 1; i >= 0; i--)
        {
            ans[i]=qqq(v,1,i-soldiersShifts[i]+1,1, soldiersShifts.length);
        }


        return ans;
    }
}
