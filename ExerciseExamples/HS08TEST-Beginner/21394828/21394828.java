
import java.text.DecimalFormat;
import java.text.NumberFormat;
import  java.util.Scanner;
class atm {
    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
int x;
Double m;

x=s.nextInt();
        m=s.nextDouble();
        NumberFormat d=new DecimalFormat("#0.00");

        d.format(m);
        if(x>0 && x%5==0 &&x<(m-0.5)) {


            System.out.println((m-x-0.5));

        }
        else
            System.out.println(m);
    }




}
