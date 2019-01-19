import java.io.*;
import java.util.*;
class unclejohny
{
public static void main(String[] args)throws java.lang.Exception {
  Scanner s=new Scanner(System.in);
  int t=s.nextInt();
  for(int ti=0;ti<t;ti++)
{
  
  int size;
  //System.out.println("Enter the size of the array");
  size=s.nextInt();
  double a[]=new double[size];
  //System.out.println("Enter array elements:");
  for(int i=0;i<size;i++)
  {
    a[i]=s.nextDouble();
  }
  unclejohny u=new unclejohny();
  //u.disp(a,size);
  //System.out.println("Enter the position");
  int find;
  find=s.nextInt();
  double check=a[find-1];
  Arrays.sort(a,0,size);
  //u.disp(a,size);
  for (int i = 0; i < size; i++)
  {
    if (a[i] == check) {
    System.out.println(i+1);

    break;
  }
}



}

 }

/* void disp(int a[],int size)
 {
   for(int i=0;i<size;i++)
   {
     System.out.print(a[i]+" ");
   }
   System.out.println("");
 }
}*/
}