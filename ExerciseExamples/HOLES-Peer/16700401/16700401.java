import java.util.Scanner;
class A
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int hole;
		int Sum[]=new int[x];
		String s;
		char arr[];

		for(int i=0;i<x;i++)
		{
			hole=0;
			s=sc.next();
			arr=s.toCharArray();
			
			for (char AB : arr)
			{
				if(AB=='B')
				{
					hole+=2;
				}
	
				else if(AB=='A'||AB=='D'||AB=='O'||AB=='P'||AB=='Q'||AB=='R')
				{
					hole+=1;
				}
			}

			Sum[i]=hole;
		}

		for (int ABC :Sum )
		{
			System.out.println(ABC);
		}

		
	}
}