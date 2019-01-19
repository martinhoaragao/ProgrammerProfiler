
/***

Author : Nikhil Sharma

***/



import java.util.Scanner;
public class Main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t ,n,k,o;
        t=sc.nextInt();
        while(t-->0)
        {
            n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            k=sc.nextInt();
            o=a[k-1];
            for(int i=0;i<n-1;i++)
            {
                for(int j=0;j<n-1-i;j++)
                {
                    if(a[j]>a[j+1])
                    {
                        int r=a[j];
                        a[j]=a[j+1];
                        a[j+1]=r;
                    }
                }
            }
            for(int i=0;i<n;i++)
            {
                if(o==a[i])
                {
                    System.out.println(i+1);
                }
            }
        }
    }
}
