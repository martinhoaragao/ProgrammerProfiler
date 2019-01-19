 import java.util.Scanner;



/**
 *
 * @author lol ik */
 class ATM {
    
   
    public static void main(String [] args)
    { //  ATM obj=new ATM();
        Scanner in=new Scanner(System.in);
       // System.out.println("Enter the amount you want to deposit");
        int a=in.nextInt();
       // System.out.println("Enter the intial amount");
        double c=in.nextDouble();
        if(c>0&&a>0&&c<=2000&&a<=2000)
        {
            String e = String.format("%.2f", c); 
       
        double f=c-0.50;
        double h=f-a;
        String j = String.format("%.2f", h); 
        if(c>=(a+0.50)&&a%5==0)
        {
            System.out.println(j); 
        }
        else if(c>(a+0.50)&&a%5!=0)
        {
          System.out.println(e);   
        }
        else
        {
             System.out.println(e); 
        }
    }
        else{
            System.out.println(c);
        }
}
}