import java.util.Scanner;

class Test{
 public static void main(String[] args)
 {
     Scanner sc=new Scanner(System.in);
     int x;
     double y;
     x=sc.nextInt();
     y=sc.nextDouble();
     if((x+0.5<=y)&&(x%5==0))
     {
      y-=x+0.5;
     }
     System.out.println(String.format("%.2f",+y));
 }
}