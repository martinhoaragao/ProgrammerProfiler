import java.util.Scanner;
import java.util.Arrays;
class D1
{
public static void main(String[]args) 
{
  Scanner sc=new Scanner(System.in);
  int t=sc.nextInt();
  while(t>0)
  {
     int result=0;
     int number=sc.nextInt();
     int []a=new int[number];
     for(int i=0;i<number;i++)
     {
        a[i]=sc.nextInt();   
     }
     int position=sc.nextInt();
     int b=a[position-1];
     Arrays.sort(a);
     for(int j=0;j<a.length;j++)
     {
         if(a[j]==b)
         {
            result=j;
         }
     }
     System.out.println(result+1);
     t--;
  }
}
}