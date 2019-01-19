import java.util.Scanner;


 class Fl {
public static void main(String[]args)
{
		Scanner sc = new Scanner(System.in);
		
		double amt = sc.nextDouble();
		double rem = sc.nextDouble();
		if(amt%5==0 && (rem-amt-0.5)>=0)
			System.out.println(rem-amt-0.5);
		else
			System.out.println(rem);
}
}
