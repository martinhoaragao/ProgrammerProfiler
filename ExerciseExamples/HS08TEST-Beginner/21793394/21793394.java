import java.util.*;
class g
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double t,a;
        t=sc.nextDouble();
        a=sc.nextDouble();
        if((t%5)==0)
        {
            if(a>(t+.50))
                System.out.println((a-t-.50));
            else
            System.out.println(a);
        }
        else
            System.out.println(a);

    }
}