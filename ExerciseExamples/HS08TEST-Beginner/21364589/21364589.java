

import java.util.Scanner;

 class main {
 public static void main(String args[]) {
		 
		 Scanner in = new Scanner(System.in);

         double X=in.nextFloat();  	
         double Y=in.nextFloat();
         if(X%5==0&&Y>=X+0.5) 
         {
           Y=(Y-X)-0.5;
        
         System.out.println(String.format("%.2f",Y));
        	 }
         else {
        	 System.out.println(String.format("%.2f",Y));
         }
         
 }
 }

