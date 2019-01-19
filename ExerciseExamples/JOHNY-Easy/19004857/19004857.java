import java.util.Arrays;
import java.util.Scanner;

class Fact {
  public static void main(String[] args) {
    
  Scanner sc=new Scanner(System.in);
    int test=sc.nextInt();
    while(test-->0)
    {
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
        
      }
      int k=sc.nextInt();
      int temp=arr[k-1];
      Arrays.sort(arr);
      for(int i=0;i<n;i++)
      {
         if(temp==arr[i])
           {
           System.out.println(i+1);
           
         }
     
        
      }
     
    }
    
  }
}
