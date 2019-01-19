import java.util.Scanner;
import java.util.Arrays;
public class Main{
  public static void main(String [] args){
    Scanner meow= new Scanner(System.in);
   
     
      int t=meow.nextInt();
      for(int i=1;i<=t;i++){
        int n=meow.nextInt();
        
        long arr[]=new long[n];
        for(int j=0;j<n;j++)
        {
         arr[j]=meow.nextInt();
       
        }
          int k=meow.nextInt();
          long temp =arr[k-1];
          int p=0;
          Arrays.sort(arr);
        
          
          for(int j=0;j<n;j++)
        {
         if(arr[j]==temp)
           p=j;
       
        }
         System.out.println((p+1));
      }}}
      