import java.util.Scanner;

public class Main
{
public static void main(String[] args)
{
int amount;
double balance;
Scanner sc=new Scanner(System.in);
amount=sc.nextInt();
double actualbalance=balance=sc.nextDouble();
balance-=.50;
if(amount%5==0 && amount<=balance)
{
actualbalance=balance-amount;
}
        System.out.printf("%.2f", actualbalance);
}
}