import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{ Scanner in=new Scanner(System.in);
  int t=in.nextInt();
  for(int i=1;i<=t;i++)
  { int n=in.nextInt();
    
    int array[]=new int[n];
    int array2[]=new int[n];
    for(int h=0;h<n;h++)
    {array[h]=in.nextInt();
      array2[h]=array[h];
     }
    int s=in.nextInt();
    int temp=0;
    for(int j=0;j<n-1;j++)
    {
    for(int k=1+j;k<n;k++)
    {
    if(array[j]>array[k])
    {temp=array[j];
    array[j]=array[k];
    array[k]=temp;}
    }} 
    
    
   
      
    
    
    
    
    
    int x=0;
    for(int f=0;f<n;f++)
    {if(array[f]==array2[s-1])
      {
        x=f+1;
        break;
    }
    }
    
    
  System.out.println(x);
  
  }
}}