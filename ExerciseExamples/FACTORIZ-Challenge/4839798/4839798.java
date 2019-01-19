import java.math.*;
import java.io.*;
import java.util.*;
class factoriz
{
	static int a[]=new int[1000001];
        static int b[]=new int[100000];
	static int sieve()
	{
        	int i,j,k,n,l=1;
		int limit=10001;
	        n=(int)Math.sqrt((double)limit);
        	a[0]=a[1]=0;
	        a[2]=a[3]=1;
		b[0]=2;
		limit--;
        	for(i=4;i<limit;i+=2)
	        {
        	        a[i+1]=1;
	                a[i]=0;
        	}
	        for(i=3;i<=n;i+=2)
        	{
                	if(a[i]==0)
                        	continue;
	                for(j=i;;j+=2)
        	        {
                	        if((i*j)<limit)
                        	        a[i*j]=0;
	                        else
        	                        break;
                	}
        	}
		for(i=3;i<=limit;i+=2)
			if(a[i]==1)
				b[l++]=i;
		return l;
	}
	public static void main(String[] args)	
	{
		int t,l,i,p,g=0;
		int ans[]=new int[10000];
		l=sieve();
		BigInteger u[]=new BigInteger[100];
		BigInteger m[]=new BigInteger[l];
		BigInteger d;
		Scanner in=new Scanner(System.in);
		t=in.nextInt();
		String s[]=new String[100];
		for(i=0;i<t;++i)
		{
			s[i]=in.next();
			d=new BigInteger(s[i]);
			u[i]=d;
		}
		for(i=0;i<l;++i)
		{
			d=new BigInteger(""+b[i]);
                        m[i]=d;
		}
		 BigInteger q=new BigInteger("1");
		BigInteger e=new BigInteger("0");
//		System.out.println("dss");
		for(i=0;i<t;++i)
		{
			p=g;
			ans[g++]=0;
			for(int j=0;j<l;++j)
			{
				while((u[i].mod(m[j])).equals(e))
				{
					u[i]=u[i].divide(m[j]);
					++ans[p];
					ans[g++]=b[j];
				}
				if(u[i].equals(q)==true)
					break;
			}
			if(u[i].equals(q)==false)
				ans[p]++;	
			for(int h=0;h<g;h++)
				System.out.println(ans[h]);
			if(u[i].equals(q)==false)
			{
				System.out.println(u[i]);
			}
			g=0;
		}
	}
}
