import java.util.*;
class ATM {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int with=sc.nextInt();
        double bal=sc.nextDouble();
        if((with%5)!=0)
            System.out.printf("%.2f",bal);
        else if((with+0.50)>bal)
            System.out.printf("%.2f",bal);
        else
        {
            bal=bal-(with+0.50);
            System.out.printf("%.2f",bal);
        }   
    }
}
