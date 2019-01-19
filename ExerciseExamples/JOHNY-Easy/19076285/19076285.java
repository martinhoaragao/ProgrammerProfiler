import java.util.*;
class sort2d
{
 public static void main(String args[])
{
    Scanner in=new Scanner(System.in);
    int t=in.nextInt();
    for(int j=0;j<t;j++)
    {
    	int n=in.nextInt();
    	long a[]=new long[n+1];
    	for(int i=1;i<=n;i++)
    	{
    	a[i]=in.nextLong();
    	}
    	int k=in.nextInt();
    	long ans=a[k];
    	Arrays.sort(a);
    	for(int i=1;i<=n;i++)
    	{
    	if(a[i]==ans)
    	{System.out.println(i);break;}
    	}
    }
    }
    }
    