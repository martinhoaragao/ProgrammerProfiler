	// ATM - 1

	import java.util.Scanner;
	class ATM
	{
		public static void main(String[] args)
		{
			int x=0;
			double y=0;
			double charge = 0.50;

			Scanner input = new Scanner(System.in);
			
			x = input.nextInt();
			y = input.nextDouble();

			if ((x>0) && (x<=2000) && (y>=0) && (y<=2000) && (x+0.5<y) && (x%5==0) ) 
				System.out.printf("%.2f\n", y-x-charge);

			else
				System.out.printf("%.2f\n",y);
		}

	}
