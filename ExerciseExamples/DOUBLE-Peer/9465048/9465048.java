import java.util.Scanner;
class test6
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t,n;
        t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            n=in.nextInt();
            if(n%2==0)
             System.out.println(n);
            else
             System.out.println(n-1);
        }
    }
}