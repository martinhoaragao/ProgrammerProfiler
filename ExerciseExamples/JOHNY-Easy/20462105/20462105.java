import java.sql.SQLOutput;
import java.util.Scanner;
class UncleJohny
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t,temp,pass,m,i,j,n,k;
        t=sc.nextInt();
        for(i=1;i<=t;i++)
        {
            int c=1;
            n= sc.nextInt();
            int a[]=new int[n];
            for(j=0;j<n;j++)
                a[j]=sc.nextInt();
            k=sc.nextInt();
            m=a[k-1];
            for(pass=1;pass<n;pass++)
            {
               for(j=0;j<n-pass;j++)
               {
                   if(a[j+1]<a[j])
                   {
                       temp=a[j];
                       a[j]=a[j+1];
                       a[j+1]=temp;
                   }
               }
            }
            for(j=0;j<n;j++)
            {
                if(m==a[j])
                    break;
                else
                    c++;
            }
            System.out.println(c);


        }


    }
}
