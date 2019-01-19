/* package whatever; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args)
	{
	  Scanner obj = new Scanner(System.in);
	  int t=0,i=0,j=0;
	  t = obj.nextInt();
	  
	  long coun=0,temp=0;
	  
	  int prime[] = new int[19505];
	  int store[] = new int[19505];
	  
	  
	  for(i=2;i<=140;i++)
	    {
	    	if(prime[i]==0)
	    	  for(j=i*i;j<19501;j=j+i)
	    	     prime[j] = 1;  
	    }
	 
	  while(t!=0){
	  
	  t--;
	  String str;
	  str = obj.next();
	 //  System.out.println(str);
	   
	  BigInteger num = new BigInteger(str);
	  BigInteger itr = new BigInteger("2");
	  BigInteger cmp1 = new BigInteger("1");
	  BigInteger cmp0 = new BigInteger("0");
	  
	  coun=0;
	  temp = 19501;
	  if(str.length()<=19){
	  long sq = (long)Math.sqrt(Double.parseDouble(str));
	  if(sq<19501)
	  temp=sq;
	  }
	  String cp = "" + temp;
	 BigInteger cmp2 = new BigInteger(cp);
	  
	  for(;num.compareTo(cmp1)==1&&itr.compareTo(cmp2)==-1;itr = itr.add(cmp1))
	  {
	  	if(prime[itr.intValue()]==0){
	  		while((num.mod(itr)).compareTo(cmp0)==0){
	  			store[itr.intValue()]++;
	  			coun++;
	  			num = num.divide(itr);
	  		}
	  	}
	  }
	  if(coun==0){
	  	System.out.println("1");
	  	System.out.println(str);
	  }
	  else if(num.compareTo(cmp1)==1){
	  	coun++;
	  		System.out.println(coun);
	  		for(i=2;i<19500;i++){
            while(store[i]!=0){
             	System.out.println(i);
                store[i]--;
              }
     }
     String pr = ""+num; 
     	System.out.println(pr);
	  }
	  else{
	  	System.out.println(coun);
	  		for(i=2;i<19500;i++){
            while(store[i]!=0){
             	System.out.println(i);
                store[i]--;
              }
         }
	  }
	  
	  }
	  
	}
} 