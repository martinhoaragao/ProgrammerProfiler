import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{

	public static Map<Long,Long>sMap= new HashMap<>(); 
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
           
            long n=scan.nextLong();
            long sum=fun(n);
            System.out.println(sum+"");
           
           
        }
       
        // your code goes here
    }
     static long fun(long n){
       if(sMap.containsKey(n))
       return sMap.get(n);
           long retVal;
            long n1=n/2;
            long n2=n/3;
            long n3=n/4;
            if(n1+n2+n3 > n){
           
            retVal= fun(n1)+fun(n2)+fun(n3);
        }
        else{
            retVal= n;
        }
        sMap.put(n,retVal);
       return retVal;
    }
}