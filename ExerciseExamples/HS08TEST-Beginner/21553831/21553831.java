import java.util.*;

class ATM
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		float y=sc.nextFloat();
		if(x+0.5<=y&&x%5==0)
			System.out.printf("%.2f",y-x-0.50);
        else 
			System.out.printf("%.2f",y);
	}
}