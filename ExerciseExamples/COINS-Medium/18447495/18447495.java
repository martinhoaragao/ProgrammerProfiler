/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static long convertCoin(long dollar) {
      long half = dollar/2;
      // System.out.println("value of half" + half);
      long qua = dollar/4;
      //  System.out.println("value of quarter" + qua);
      long third = dollar/3;
      // System.out.println("value of third" + third);
      long convert = half+qua+third;
      /*int profit;
    
       profit = (convert>dollar) ? convert : dollar;
        return profit;*/
    
        if(convert > dollar) {
    	  return (convertCoin(dollar/2) + convertCoin(dollar/3) + convertCoin(dollar/4));
        }
        else
          return dollar;
    
  }
  
	public static void main (String[] args) throws java.lang.Exception {
      //System.out.println("Accepting user input");
	  Scanner sc = new Scanner(System.in);

        //String input = sc.next();
        //int profitValue = convertCoin(Integer.valueOf(input));
        //while(sc.hasNext())
        
        for(int i=0; i<10; i++)  {
          int inp = sc.nextInt();
          Long input = new Long(inp);
          Long profitValue = convertCoin(input);
          //System.out.println("Coin exchange happened" + profitValue);
          System.out.println(profitValue);
        }
   
  }
 
}