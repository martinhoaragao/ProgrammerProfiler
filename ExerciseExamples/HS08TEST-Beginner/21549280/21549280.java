import java.util.Scanner;
class HS08TEST
{
	public static void main(String[] b)
	{
		Scanner sc=new Scanner(System.in);
		float X=sc.nextFloat();
		float Y=sc.nextFloat();
		if(((X+0.50)>Y)||((X%5)!=0))
			System.out.printf("%.2f",Y);
		else
			System.out.printf("%.2f",Y-(X+0.50));
	}
}