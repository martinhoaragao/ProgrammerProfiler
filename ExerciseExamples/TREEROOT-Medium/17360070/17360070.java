
 import java.util.*;
 
 class treeroot {
 
  public static void main(String args[])
 
 {
    Scanner ip = new Scanner(System.in);
    int t = ip.nextInt();
    while(t>0)
 {
    int n = ip.nextInt();
    int i;
    int sumOfx=0,sumOfy=0;
     for(i=0;i<n;i++)
      
     {
       int x = ip.nextInt();
       int y = ip.nextInt();
     
       sumOfx += x;
       sumOfy += y;
    }
 
   System.out.println(sumOfx - sumOfy);
   t--;
    }
   }
  }
 
         