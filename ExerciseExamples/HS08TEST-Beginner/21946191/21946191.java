import java.util.Scanner;

class Demo1 {	
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	double x = in.nextDouble();
	double y = in.nextDouble();
	double z = y-x-0.50;

	if((x+0.50 > y) || (x % 5 != 0))
		System.out.printf("%.2f", y);
	else
		System.out.printf("%.2f", z);
    }
}