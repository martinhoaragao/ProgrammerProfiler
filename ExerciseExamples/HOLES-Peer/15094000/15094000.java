import java.util.Scanner;
class p1 
{	
	public static void main(String[] args) 
	{
		int t,flag=0,count=0;
		String str="",upper;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
			upper=sc.next();
			str=upper.toUpperCase();
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(j)=='A'||str.charAt(j)=='D'||str.charAt(j)=='O'||str.charAt(j)=='P'||str.charAt(j)=='Q'||str.charAt(j)=='R')
				{
					flag++;
				}
				if(str.charAt(j)=='B')
				{
					count+=2;
				}
			}
			count=count+flag;
			System.out.println(count+"\n");
			flag=0;count=0;
			upper="";
			str="";
		}
	}
}
