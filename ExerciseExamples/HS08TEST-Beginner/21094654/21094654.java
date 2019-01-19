import java.util.*;
class ATM
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int x = s.nextInt();
    double f = s.nextDouble();
    if(x>=Math.round(f))
    System.out.printf("%.2f",f);
    else if(x%5 != 0)
    System.out.printf("%.2f",f);
    else
    {
    Double p =(f-0.50-Double.valueOf(x));

    System.out.printf("%.2f", p);
  }

  }
}
