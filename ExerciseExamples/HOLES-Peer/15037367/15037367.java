
import java.util.*;

class holes {
	public static void main(String[] args) {
		int t,c=0;
		Scanner s = new Scanner(System.in);
		t = s.nextInt();
		String q;
		for(int i=0;i<t;i++)
		{
			q = s.next();c=0;
			for(int j=0;j<q.length();j++)
			{
				if(q.charAt(j)=='A'||q.charAt(j)=='D'||q.charAt(j)=='O'||q.charAt(j)=='P'||q.charAt(j)=='Q'||q.charAt(j)=='R')
				{
					c++;
				}
				else if(q.charAt(j)=='B')
					c=c+2;

			}
			System.out.println(c);
		}
	}
}
