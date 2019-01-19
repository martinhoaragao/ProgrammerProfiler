import java.util.*;
class abc1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			String s=sc.next();int n=0;
			for(int i=0;i<s.length();i++)
			{
				s=s.toUpperCase();
				char c=s.charAt(i);
				if(c=='A'||c=='D'||c=='O'||c=='P'||c=='Q'||c=='R')
				{
					n++;
				}
				else if(c=='B')
				{
					n=n+2;
				}
			}
			System.out.println(n);
			t--;
		}		
	}
}