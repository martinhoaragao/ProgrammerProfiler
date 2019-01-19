import java.io.*;
import java.util.*;
class Lab{
 public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     double k = sc.nextDouble();
       if((n+0.50)>k)
        System.out.printf("%.2f",k);
     else if(n%5!=0)
          System.out.printf("%.2f",k);
      else
     {k-=n;
      k-=0.50;
     System.out.printf("%.2f",k);
     
     }
 }}