import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;
 class CC_ATM {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		int trscn;
		double balnc;
		Scanner sc=new Scanner(System.in);
		trscn= sc.nextInt();
		balnc= sc.nextDouble();
		DecimalFormat dec=new DecimalFormat("#0.00");
		if( (trscn >0 && trscn<=2000)&&(balnc >=0 && balnc<=2000))
		{
			if((trscn+0.50)<=balnc)
			{
			if(trscn% 5 ==0)
			{
				System.out.println(dec.format(balnc-(trscn+0.50)));
			}
			else
				System.out.println(dec.format(balnc));
			}
			else
			{
				System.out.println(dec.format(balnc));
			}
		}
	}

}
