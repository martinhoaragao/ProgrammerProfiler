import java.util.*;
class holes
{
	Scanner sc;
	int hole;
	String query;
	public static void main(String arg[])
	{
		holes h1 = new holes();
		h1.sc = new Scanner(System.in);
		int t = h1.GetInteger();
		h1.CheckTestCase(t);
	}
	int GetInteger()
	{
	return sc.nextInt();
	}
	
	void CheckTestCase(int t)
	{
		while(t-->0)
		{
			query = sc.next();
			char n;
			hole=0;
			for(int i=0;i<query.length();i++)
			{
				n = query.charAt(i);
				if(n == 'A' || n == 'Q' || n == 'R' || n == 'O' || n == 'P' || n == 'D')
					hole++;
				else if(n == 'B')
					hole+=2;
			}
			System.out.println(hole);
		}
	}
}