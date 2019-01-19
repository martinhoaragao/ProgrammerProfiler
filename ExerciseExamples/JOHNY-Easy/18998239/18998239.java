import java.util.*;
class Codechef
{
	public static void main (String[] args)
	{
	   Scanner sc=new Scanner(System.in);
	   int t,j,n,k,b,temp,x,i;
	   t=sc.nextInt();
	   for(j=0;j<t;j++)
	   {
	       n=sc.nextInt();
	       int a[]=new int[n];
	       for(i=0;i<n;i++)
	       {
	           a[i]=sc.nextInt();
	       }
	       k=sc.nextInt();
	       b=a[k-1];
	      for(i=0;i<n;i++) 
        {
            for(x=i+1;x<n;x++) 
            {
                if (a[i] > a[x]) 
                {
                    temp = a[i];
                    a[i] = a[x];
                    a[x] = temp;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==b)
            {
                System.out.println(i+1);
            }
            else{
                
            }
        }
	   }
	}
}
