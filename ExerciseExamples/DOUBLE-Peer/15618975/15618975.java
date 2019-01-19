import java.util.*;
class Neo2
 {
     public static void main(String args[])
      {
          int i;
          Scanner in=new Scanner(System.in);
          int t=in.nextInt();
          for(i=0;i<t;i++)
          {
              int p=in.nextInt();
              if(p%2==0)
              System.out.println(p);
              else System.out.println(p-1);
          }
          
      }
 }