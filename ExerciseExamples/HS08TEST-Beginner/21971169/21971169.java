import java.util.*;
class Atm
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        double y=sc.nextDouble();
        if(x%5==0 && ((x+0.5)<=y))
        {
            double t=y-(x+0.50);
            System.out.printf("%.2f",t);
        }
         else
        {
             System.out.printf("%.2f",y);
        }
    }
}
        