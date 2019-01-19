import java.util.*;
class Holes
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			String s1=s.next();
			char ar[]=new char[s1.length()];
			ar=s1.toCharArray();
			int count=0;
			for(int i=0;i<s1.length();i++)
			{
				if(ar[i]=='A'||ar[i]=='D'||ar[i]=='O'||ar[i]=='P'||ar[i]=='R'||ar[i]=='Q')
				count++;
				if(ar[i]=='B')
				count+=2;
			}
			System.out.println(count);
		}
	}
}