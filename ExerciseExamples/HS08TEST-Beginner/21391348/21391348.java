import java.util.*;
class ATM 
{
    public static void main(String arys[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        double b;
        a=sc.nextInt();
        b=sc.nextDouble();
        double bal=((a%5==0)&&(a+0.5<b))?(b-a-0.50):b;
        System.out.printf("%.2f\n",bal);
    }
}