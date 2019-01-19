import java.util.Scanner;
import java.util.Arrays;
class JHONNY
{
 public static void main(String args[])
 {
  Scanner s1=new Scanner(System.in);
  int t=s1.nextInt();
  while(t>0)
  {
   int n=s1.nextInt();
   int[] song=new int[n];
   for(int i=0;i<n;i++)
   {
    song[i]=s1.nextInt();
   }
   int uncle=s1.nextInt();
   int temp=song[uncle-1];
   Arrays.sort(song);
   for(int i=0;i<n;i++)
   {
     if(temp==song[i])
     {
      uncle=i+1;
      break;
     }
   }
    System.out.println(uncle);
    t--;
  }
 }
}