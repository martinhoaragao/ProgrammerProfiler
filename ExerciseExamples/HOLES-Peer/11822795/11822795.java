import java.util.*;
public class Main
{
	public static void main(String ar[])throws Exception
	{
		int t,i,n,j;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(i=0;i<t;i++)
		{
			n=0;
			String str=sc.next();
			for(j=0;j<str.length();j++)
			{
				if(str.charAt(j)=='B')
					n+=2;
				else if(str.charAt(j)=='A'||str.charAt(j)=='D'||str.charAt(j)=='P'||str.charAt(j)=='Q'||str.charAt(j)=='R'||str.charAt(j)=='O')
					n++;
			}
			System.out.println(n);
		}
		sc.close();
	}
}
