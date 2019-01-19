import java.util.Scanner;
public class Main {
	    public static void main(String[] args) {
	        
	        Scanner s=new Scanner(System.in);
	        int X=s.nextInt();
	        double total=s.nextDouble();

             if((0<X && X<=2000)&&( 0<=total && total<= 2000))
             {
	         if((X%5!=0)||((X+0.50)>total))
	          {
	            System.out.print(total);      
	           }
	        
	           else
	           {
	            System.out.print((total-0.50)-X);
	         
	           }
	        	        
	     }
      }
   }

        























