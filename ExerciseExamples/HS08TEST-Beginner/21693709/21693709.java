import java.util.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		float f=sc.nextFloat();
		if(t%5==0 && ((float)t+0.5)<=f)
		f-=((float)t+0.50);
		System.out.printf("%.2f",f);
	}
}