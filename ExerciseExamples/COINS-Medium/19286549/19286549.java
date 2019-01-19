import java.util.*;
 
 
 class FindMax {
public static long sum(long num)
                {
                   long a,b,c,d=0;
                   a=num/2;
                   b=num/3;
                   c=num/4;
                   d=a+b+c;
                   if(d>num)
                   {
                       num=sum(a)+sum(b)+sum(c);
                   }
                    return num;       
                }
	public static void main(String s[]) throws Exception {
                Scanner scan=new Scanner(System.in);
		
		long n;
                
                
                while(scan.hasNext())
                {
                n=scan.nextLong();
                System.out.println(sum(n));
                               
                
                }
	}
	}