import java.util.Scanner;
class A
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
			char a='a';
			int num=0;
			String s=sc.next();
			for(int j=0;j<s.length();j++)
			{
				a=s.charAt(j);
				if(a=='A'||a=='D'||a=='O'||a=='P'||a=='Q'||a=='R')
				num++;
				if(a=='B')
				num+=2;
			}
			System.out.println(num);
		}
	}
}
//ABDOPQR