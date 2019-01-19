import java.io.*;
import java.util.*;
class ATM
{ 
    public static void main(String[]args)
    {
            Scanner sc = new Scanner(System.in);
            int x=sc.nextInt();
            double y = sc.nextDouble();
            if((x+0.50<y)&&(x%5==0))
            {
                y=y-(x+0.50);
            }
             System.out.printf("%.2f",y);
            }
        }
                 
                