import java.text.DecimalFormat;
import java.util.Scanner;

class ATM{
    public static void main(String[] args){
        
        Scanner in=new Scanner(System.in);
        double withdraw=in.nextFloat();
        double total=in.nextFloat();
        DecimalFormat form=new DecimalFormat("0.00");
        
        if(withdraw%5==0 && withdraw<(total-0.50)){
            total-=withdraw;
            total-=0.50;
            System.out.print(form.format(total));
        }
        else
         System.out.print(form.format(total));
    }
}