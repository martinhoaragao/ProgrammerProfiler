import java.util.*;
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		String str;
		char chr;int count;
		while(t>0)
		{
			count=0;
			str=sc.next();
			for(int i=0;i<str.length();i++)
			{
				chr=str.charAt(i);
				if((chr=='A')||(chr=='Q')||(chr=='R')||
				(chr=='O')||(chr=='P')||(chr=='D'))
				count++;
				else if(chr=='B')
				count+=2;
			}
			System.out.println(count);
			t--;
		}
	}
}
							
		