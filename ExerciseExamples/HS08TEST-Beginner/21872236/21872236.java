import java.util.*;
import java.text.*;
class Test{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	double x = sc.nextDouble();
	double y = sc.nextDouble();
	DecimalFormat df = new DecimalFormat("0.00");
	if(x % 5 == 0 && (x+0.5) <= y) System.out.println(df.format(y-x-0.5));
	else System.out.println(y);
}
}