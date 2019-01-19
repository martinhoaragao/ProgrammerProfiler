import java.io.*;
import java.util.*;
class BankAtm{
 public static void main(String [] args){
  Scanner in=new Scanner(System.in);
  int s=in.nextInt();                   //getting the Withdraw Amount
  double w=(double)s;                     //Convert into float
  double a=in.nextDouble();               //getting the available balance  
  if (0<w&&w<2001)         
   {
     if(0<a&&a<2001)
      
   {
     if((w%5)==0)                        //checking the withdraw amount multiple of 5
       {  
           if(a>(w+0.50))                       //checking the withdraw is less than available
            {
                System.out.format("%.2f",(a-0.50)-w);
             }
            else
             {
               System.out.format("%.2f",a);
             }}
       else
       { 
          System.out.format("%.2f",a);
        }}}
}
       

}