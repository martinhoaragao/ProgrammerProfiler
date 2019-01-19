import java.io.*;
import java.util.*;
class holes
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		int n,t,count;
		t=Integer.parseInt(br.readLine());
		while(t>0)
		{
			s=br.readLine();
			n=s.length();
			char[] c=new char[n];
			c=s.toCharArray();
			count=0;
			for(int i=0;i<n;i++)
			{
				if(c[i]=='A' || c[i]=='D' || c[i]=='O' || c[i]=='P' || c[i]=='R' || c[i]=='Q')
					count++;
				if(c[i]=='B')
					count=count+2;
			}
			System.out.println(count);
			t--;
		}
	}
}