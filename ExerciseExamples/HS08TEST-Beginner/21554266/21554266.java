import java.text.DecimalFormat;
import java.util.Scanner;
class HS08TEST {

	private static DecimalFormat df2 = new DecimalFormat(".00");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				int x = scan.nextInt();
				double y = scan.nextDouble();
				if(x+0.5 > y) {
					System.out.println(df2.format(y));
				}
				else if(x % 5 != 0) { 
					System.out.println(df2.format(y));
				}
				else {
					System.out.println(df2.format(y-x-0.50));
				}
				scan.close();
	}
}
	

