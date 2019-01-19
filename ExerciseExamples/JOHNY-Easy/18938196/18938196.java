import java.util.Scanner;
class Un
{

  static int sort(int[] b,int num)
  {
    int in=0;
    for(int i=1;i<b.length;i++)
    {
      int key=b[i];
      int j=i-1;
      while((j>=0)&&(b[j]>key))
      {
        b[j+1]=b[j];
        j--;
      }
      b[j+1]=key;
    }


    for(in=0;in<b.length;in++)
  {
    if(b[in]==num)
    {
        break;
    }
  }
return in+1;

  }

  public static void main(String args[])
  {
    int index,num;
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t!=0)
   {
     int n =sc.nextInt();
     int[] arr= new int[n];
     for(int i=0;i<n;i++)
     {
       arr[i]=sc.nextInt();

     }
     index=sc.nextInt();
     index--;
     num=arr[index];
     System.out.println(Un.sort(arr,num));
     t--;
   }



  }
}
