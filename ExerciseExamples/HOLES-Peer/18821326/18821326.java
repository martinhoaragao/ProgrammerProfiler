import java.util.Scanner;
public class Main
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int t;
		String s;
		char c;
		t=sc.nextInt();
		int ans[]=new int [t];
		for(int i=0;i<t;i++)
		{
                    ans[i]=0;
			s=sc.next();
			for(int j=0;j<s.length();j++)
			{
				c=s.charAt(j);
				switch(c)
				{
					case 'A':
					case 'D':
					case 'O':
					case 'P':
					case 'Q':
					case 'R':ans[i]++;
						break;
					
					case 'B':ans[i]+=2;
						break;											
				}
			}	
		}
		for(int i=0;i<t;i++)
			System.out.println(ans[i]);
	}
}