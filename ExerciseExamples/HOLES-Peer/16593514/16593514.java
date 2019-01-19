import java.io.*;
import java.util.*;
class HOLES
{
	public static void main(String[] args)throws IOException
	{
		int t,h;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		t=Integer.parseInt(br.readLine());
		String s;
		while(t-->0)
		{
			h=0;
			int a[]= {1,2,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0};
			s=br.readLine();
			for(int i=0;i<s.length();i++)
			{
				h+=a[(int)s.charAt(i)-65];
			}
			System.out.println(h);
		}
	}
 
}
 