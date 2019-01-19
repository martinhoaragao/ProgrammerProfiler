import java.io.*;
class Main
{
    static int M = 1000000;
    static int b[];
    static int bcount;
    public static void generatePrime()
    { 
        int a[] = new int[M];
        for(int i = 2 ; i < M ; i++)
        a[i] = i;
        
        b = new int[100000];
        bcount = 0;
        int pos = 2;
        while(pos < M)
        {
            if(a[pos] != 0)
            {
                b[bcount++] = a[pos];
                for(int i = pos*2 ; i < M ; i += pos)
                {
                    a[i] = 0;
                }
            }
            pos++;
        }       
    }
    public static void main(String args[])throws IOException
    {
        generatePrime();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader br = new BufferedReader(new FileReader("testcase.dat"));
        int t = Integer.parseInt(br.readLine());//testcases
        long num;
        int primeIndex;
        int count;//count no. of factors
        long factors[];//store all factors
        String s;
        while(t-- > 0)
        {
            factors = new long[100000];
            count = 0;
            primeIndex = 0;
            s = br.readLine();
            if(s.length() > 18 || s.equals("1"))
            {
                System.out.println("1\n" + s);
            }
            else
            {
                num = Long.parseLong(s);
                while(primeIndex < bcount)
                {
                    while(num % b[primeIndex] == 0)
                    {
                        factors[count++] = b[primeIndex];
                        num /= b[primeIndex];
                    }
                    primeIndex++;
                }
                if(num > 1)
                factors[count++] = num;
                System.out.println(count);
                for(int i = 0 ; i < count ; i++)
                System.out.println(factors[i]);
            }
            
        }
    }
}