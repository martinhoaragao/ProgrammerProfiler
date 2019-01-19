import java.util.*;
class task2 {
    public static void main(String s[])
    {
        int t;
        Scanner scan = new Scanner(System.in);
        t=scan.nextInt(); //test cases
        int[] n = new int[t]; //lengths of palindrome
        int[] d =new int [t];//length of double
        for(int i=0;i<t;i++)
        {
            n[i]=scan.nextInt();
            if(n[i]%2==0)
               d[i]=n[i]; 
            else
                d[i]=n[i]-1;
        }
        for(int j=0;j<t;j++)
        {
            System.out.println(d[j]);
        }
    }
}