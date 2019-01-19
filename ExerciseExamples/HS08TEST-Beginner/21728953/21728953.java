import java.util.Scanner;

class demo{
	public static void main(String arg[]){
	Scanner sc = new Scanner(System.in);
	int  a = Integer.parseInt(sc.next());
	float b;
	
	b = Float.parseFloat(sc.next());
	
	float c=calculateBalance(a,b);
	System.out.println(String.format("%.2f" ,c));
	}
	public static float calculateBalance(int a,float b)
	{
	
		if(a%5 != 0 || a>b-0.50f)
		{return b;
		}
		return b-a-0.50f;
	}


}