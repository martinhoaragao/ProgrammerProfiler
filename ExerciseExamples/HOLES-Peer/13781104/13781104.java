import java.util.Scanner;
class holes
{
	public static void main(String args[])
	{
		int a[]=new int[]{1,2,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0};
		
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		s.nextLine();
		if(t>=1 && t<=40)
		{
			for(int ti=0;ti<t;ti++)
			{
				String arr=s.nextLine();
				int sum=0;
				for(int i=0;i<arr.length();i++)
				{
					if(arr.charAt(i)>='A' && arr.charAt(i)<='Z')
					{
						sum+=a[arr.charAt(i)-'A'];
					}
				}
				System.out.println(sum);
			}
		}
	}
}