import java.util.*;
import java.text.DecimalFormat;
class Two
{
	public static void main(String s[])
    {
        Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
        int wamt = sc.nextInt();
        double amt =sc.nextDouble();
        if(wamt==0 || amt==0 ||wamt%5!=0 || amt<(wamt+0.50))
        {
            System.out.println(df.format(amt));
        }
		else
			System.out.println(df.format(amt - wamt - 0.50));
    }
    
}