import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,r,n,i;
		int[][] s;
		Scanner in = new Scanner(System.in);
		t=in.nextInt();
		while(t>0)
		{
			r=0;
			n=in.nextInt();
			s=new int[n][2];
			for(i=0;i<n;i++)
			{
				s[i][0]=in.nextInt();
				s[i][1]=in.nextInt();
				r+=s[i][0]-s[i][1];
			}
			t=t-1;
			System.out.println(r);
		}
	}
}