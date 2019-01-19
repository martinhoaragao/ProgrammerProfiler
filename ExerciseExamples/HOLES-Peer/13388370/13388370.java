import java.util.Scanner;

class Holes
{
  public static void main(String[] args)
  {
     int i,j,k;
     String A;
     int count = 0;
     Scanner sc = new Scanner(System.in);
     int T = sc.nextInt();
     for(i=0;i<T;i++)
     {
       A = sc.next();
       for(j=0;j<A.length();j++)
       {
         char X = A.charAt(j);
         if(X == 'A' || X == 'D' || X == 'O' || X == 'P' || X == 'Q' || X == 'R')
         {
           count += 1;
         }
         if(X == 'B')
         {
           count += 2;
         }
       }
       System.out.println(count);
       count = 0;
     }
  }
}
