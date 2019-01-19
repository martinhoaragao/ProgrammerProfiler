import java.util.*;
public class Main
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int x;
  double y,z; 
  x=sc.nextInt();
  y=sc.nextDouble();
 if(x%5==0 && y>x+.50)

 {
	
  z=y-(x+.50);
  System.out.println(String.format("%.2f", z));
  }
  else 
  {
    System.out.println(String.format("%.2f", y));
  }
 }
}