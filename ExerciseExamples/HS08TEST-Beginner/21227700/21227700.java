import java.util.*;
class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	// DecimalFormat df=new DecimalFormat(".##");
		double x,y;
		x=sc.nextDouble();
		y=sc.nextDouble();
		if(x%5==0 && (x+0.50)<=y){
			 
			y=y-(x+0.50);
		}
		System.out.println(String.format("%.2f", y));
	}
}
