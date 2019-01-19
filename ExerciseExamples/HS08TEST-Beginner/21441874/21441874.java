import java.util.*;
class namer
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int x;
        double y;
        double z;
        x = sc.nextInt();
        y = sc.nextDouble();
        double x1 = (double) x;
        if(x1+0.50>y)
        System.out.printf("%.2f\n",y);
        else if(x1%5!=0)
        System.out.printf("%.2f\n",y);
        else
        {
        z=y-x1-0.50;
        System.out.printf("%.2f\n",z);
    }}
}