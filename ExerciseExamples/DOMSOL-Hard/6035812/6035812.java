/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;


class Main {
 static	BigInteger mo = new BigInteger("10000007");
 static int in[] = new int[1000007];
 static int out[] = new int[1000007];
 static int ans[] = new int[1000007];
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
       // System.out.println("first line is " + line);
        
        int t = Integer.parseInt(line);
        int ca;
        int hi = 0;
        //System.out.println("you gave " + t + " test cases ");
       // for(ca=1;ca<=t;ca++){
            
            line = br.readLine();
        
        String[] my = line.split(" ");
       // int x,y;
        //x = Integer.parseInt(my[0]);
        //y = Integer.parseInt(my[1]);
      //  System.out.println(" you gave " + x + "  and " + y);
      int x;
      for(ca=1;ca<=t;ca++)
      {
          in[ca] = Integer.parseInt(my[ca-1]);
      }
        //in[ca]=x;
       // out[ca]=y; 
       //
           // }
           
             line = br.readLine();
             my = line.split(" ");
             for(ca=1;ca<=t;ca++)
      {
          out[ca] = Integer.parseInt(my[ca-1]);
      }
      
     //System.out.println(Arrays.toString(in));
           ans[0] = 0;
           ans[1] = dif(in[1],out[1]);
           for(ca=2;ca<=t;ca++)
           {
               int fir,sec;
               fir = ans[ca-1] + dif(in[ca],out[ca]);
               sec = ans[ca-2] + dif(in[ca],in[ca-1]) + dif(out[ca],out[ca-1]);
               ans[ca] = max(fir,sec);
               
           }
            
            for(ca=1;ca<=t;ca++)
            {
                //System.out.println(" for " + ca + " we have max " + ans[ca]);
            }
       
            
            
           System.out.println(ans[t]);
       
    }
    public static int max(int a,int b)
    {
        if(a>b)return a;
        return b;
    }
    public static int dif(int a,int b)
    {
        if(a>b)return a-b;
        return b-a;
    }
   public static BigInteger fa(int n){
   	BigInteger res = BigInteger.ONE;
   	int i;
   	for(i=1;i<=n;i++)
   	{
   	BigInteger cur = new BigInteger(i+"");
   	res = res.multiply(cur);
   
   	}
   	return res;
   }
  
}

