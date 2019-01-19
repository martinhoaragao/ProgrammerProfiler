import java.util.*;
import java.text.DecimalFormat;

class Atm{

     public static void main(String []args){
        DecimalFormat df2 = new DecimalFormat("#.00");
        
        Scanner sc = new Scanner(System.in);
        double withdraw, balance;
        withdraw = sc.nextDouble();
        balance = sc.nextDouble();
        if(withdraw<balance){
            if(withdraw%5==0 && (withdraw+0.5)<=balance){
                System.out.print(df2.format(balance-withdraw-0.5));
            }else{
                System.out.print(df2.format(balance));
            }
        }else{
            System.out.print(df2.format(balance));
        }
     }
}