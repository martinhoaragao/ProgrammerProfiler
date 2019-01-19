import java.util.*;
class survive
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{	
			int holes=0;
			String s = sc.next();
			int l = s.length();
			for(int j=0;j<l;j++)
			{
				char p = s.charAt(j);
				if(p=='A'||p=='D'||p=='O'||p=='P'||p=='Q'||p=='R')
				{
					holes++;
				}
				if(p=='B')
				{
					holes=holes+2;
				}
			}
			System.out.println(holes);
		}
		
 
 
	}
} 