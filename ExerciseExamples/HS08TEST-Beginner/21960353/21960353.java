import java.util.*;
import java.lang.*;
import java.util.Scanner;

class Codechef
{
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        double withdraw=s1.nextDouble();
        double AccBal=s1.nextDouble();

        if(AccBal>=withdraw+0.5)
        {
            if(withdraw%5==0)
              { AccBal=AccBal-withdraw-0.5;
                System.out.printf("%.2f",AccBal);
              }
            else
            {
                System.out.printf("%.2f",AccBal);
            }
        }
        else
        {
             System.out.printf("%.2f",AccBal);
        }
    }
}