/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main
{   public static void  factorize(BigInteger n){
	 if(n==BigInteger.ONE){
        System.out.println(1);
        System.out.println(1);
        return;
    }
    Vector factor = new Vector();
    BigInteger ZERO=new BigInteger("0");
    BigInteger ONE=new BigInteger("1");
    BigInteger TWO=new BigInteger("2");
    BigInteger THREE=new BigInteger("3");
     while(n.mod(TWO).equals(ZERO)){
        factor.addElement(TWO) ;
        n=n.divide(TWO);
        }
    BigInteger i=new BigInteger("3");
    BigInteger maxx=new BigInteger("6850");
 
    for( ;i.compareTo(n.min(maxx))==-1;i=i.add(TWO)){
        if(n.mod(i).equals(ZERO)){
 
            while(n.mod(i).equals(ZERO)){
                 factor.addElement(i) ;
                 n=n.divide(i);
                 }
        }
    }
    if(n.compareTo(ZERO)==1) factor.addElement(n) ;
 
 
      Enumeration vEnum = factor.elements();
     System.out.println(factor.size());
      while(vEnum.hasMoreElements())
         System.out.println(vEnum.nextElement().toString());
      System.out.println();
    
    
    }
    
    
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
	     int test;
	     Scanner kb=new Scanner(System.in);
	     test=kb.nextInt();
	     
	     while(test>0){
	     	String s;
	     	s=kb.next();
	     	BigInteger n=new BigInteger(s);
	     	factorize(n);
	     	test--;
	     
	     }
	     
	}
}