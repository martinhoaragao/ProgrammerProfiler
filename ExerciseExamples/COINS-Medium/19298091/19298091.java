import java.util.*;
class Main
{public static long SS(long num)
 {long a,b,c;
  
  a=num/2;
  b=num/3;
  c=num/4;
  if(a+b+c>num)
  	num=SS(a)+SS(b)+SS(c);
  return num;
  
 }
 
 public static void main(String args[])throws Exception
 {Scanner sc=new Scanner(System.in);int i=0;long n;
  while(sc.hasNext())
  {
  n=sc.nextLong();
  
  System.out.println(SS(n));
  if((i++)==10)
      break;
  }
  
 }
 } 