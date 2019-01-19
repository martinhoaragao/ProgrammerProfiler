import java.util.*;
import java.lang.*;


class Codechef{
   
     public static final float WITHDRAW_CHARGES = new Float(0.50);
   
     public static void main(String[] args) throws Exception{
   
        int withdraw = 0;
        float balance = 0;
        boolean valid_amount = false;
        
        
        Scanner scan = new Scanner(System.in);
   
        // scan for withrdraw amount
        withdraw = scan.nextInt();
   
        // scan for balance amount
        balance = scan.nextFloat();
   
        //check if withdraw amount is multiple of 5
        valid_amount = audit_withdraw(withdraw, balance);
   
        if(valid_amount){
            
            balance = balance - withdraw - WITHDRAW_CHARGES ;
   
            System.out.printf("%.2f\n", balance);
   
        }
        else{
           System.out.printf("%.2f\n", balance);
      
        }
    
     }
     
     public static boolean audit_withdraw(int withdraw, float balance){
   
      if((withdraw%5 == 0) && (withdraw + WITHDRAW_CHARGES<= balance)){
          return true;
      }
      else return false;

     }
}