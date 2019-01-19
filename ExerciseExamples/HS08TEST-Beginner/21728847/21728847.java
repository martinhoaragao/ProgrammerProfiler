import java.util.*;
class Atm
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		float f=sc.nextFloat();
		if(f>0 && t%5==0)
		{
			if(f-0.50f-t<0)
			{
				System.out.println(String.format("%.2f",f));
			}
			else
			{
				System.out.println(String.format("%.2f",(f-t-0.50f)));
			}
		}
		else
		{
			System.out.println(String.format("%.2f",f));
		}
	}
}