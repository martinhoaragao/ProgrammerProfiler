import java.util.Scanner;
class One { 
   public static void main(String args[]){     
       Scanner sc=new Scanner(System.in);
       double withdraw=sc.nextDouble();
       double account_bal=sc.nextDouble();
       if(account_bal<withdraw+0.5 || withdraw%5!=0)
           System.out.println(account_bal);
       else{
           double new_accbalance=account_bal-withdraw-0.5;
           System.out.println(new_accbalance);
        }
   }
}