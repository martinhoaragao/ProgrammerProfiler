import java.io.*;
import java.util.*;
 
class Holes
 {
      public static void main(String args[]) throws IOException
   {
    int sum;
    int a;
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
   while( a > 0)
   {
    sum=0;
    String m=sc.next();
    
    for(int i=0;i<m.length();i++)
    {
      char c=m.charAt(i);
      if(c == 'A'|| c == 'D' || c=='O'|| c=='P'|| c=='Q'|| c=='R')
      {
        sum++;
       }
       else if(c == 'B')
       {
         sum = sum + 2;
        }
       
      } 
     
        System.out.println(sum);
        a--;
        }
     }
    }  