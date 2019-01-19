import java.text.DecimalFormat;
import java.util.Scanner;
 class b{
	 public static void main(String args[])
	 {
	 Scanner sc=new Scanner(System.in);
	 int x=sc.nextInt();
	 float y=sc.nextFloat();
	 double charge=0.5;
	 DecimalFormat df=new DecimalFormat("####.##");
	 
	 
	 if(y-x-charge>=0&&x%5==0) {
		 System.out.println(df.format(y-x-charge));
		 
		 
	 }
	 
	 else {
		 System.out.println(y);
	 }
	 
	 
	 
	 
}}