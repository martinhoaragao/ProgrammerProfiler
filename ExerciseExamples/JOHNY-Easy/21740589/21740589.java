import java.util.Scanner;
import java.util.Arrays;

class Johny
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  int t = sc.nextInt();
  
  while(t>0)
  {
    int n = sc.nextInt();
    
    int arr[] = new int[n];
    
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    
    int pos = sc.nextInt();
    int temp = arr[pos-1 ];
    
    Arrays.sort(arr);
    
    for(int i=0;i<n;i++)
    {
     if(arr[i]==temp)
     {
      System.out.println(i+1);
      break;
     }
    }
    
  t--;
  }
  
 }

}