/*import java.util.*;
class Demo
{
    public static void main(String args[])
     {
          Scanner cin = new Scanner(System.in);
          int a= cin.nextInt();
          int b=0;
          int counter=0;
                 while(a>0)
                   {counter =0;
              b = cin.nextInt();
              for(int i=5;b/i>=1;i*=5)
              {
              	counter+=b/i;
              }
              System.out.println(counter);
                 a-=1;
                   }

     }
}*/

/*
import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		Scanner cin= new Scanner(System.in);
		int num =0;
		int a = cin.nextInt();
		Random obj = new Random();
		int b = cin.nextInt();
		int c = a - b;
		int e=1;
		while(e>0)
		{
			int d = c%10;
             c=c/10;
              while(true)
            {
            	int f = obj.nextInt(10);
             if(f!=d)
             {
             	c=c*10 + f ;
             	break;
             }
             }  
             e-=1;
		}
		System.out.println(c);
	}
}*/

/*
import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		Scanner cin= new Scanner(System.in);
		int a = cin . nextInt();
		while(a>0)
		{
            int b = cin.nextInt();
            int c[] = new int[b];
            for(int i=0;i<c.length;i++)
            {
            	c[i] = cin.nextInt();
            }
 
            

    int min=1000000000;
    int d=0;
    for(int i=0;i<b;i++)
    for(int j=i+1;j<b;j++)
    {
     d=Math.abs(c[i]-c[j] );
     if(d<min)
     min=d;
     }
     System.out.println(min);

			a-=1;
		}
	}
}

import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while(t-->0)
		{
		int a =cin.nextInt();
		int b = cin.nextInt();
		int c[] = new int[a];
		int d[] = new int[a];
		int e[] = new int[a-b];
		int k=0;

		for(int i=0;i<b;i++)
		{
			int temp = cin.nextInt();
			c[temp-1]=1;
         }
         for(int i=0;i<c.length;i++)
         {
              if(c[i]==0)
               d[i]=1;
         }

         for(int i=0;i<d.length;i++)
         {
         	if(d[i]==1)
         	{
         	   e[k]=i+1;
         	   k++;
         	}

         }
             for(int i=0;i<e.length;i+=2)
             {
             	System.out.print(e[i] +" ");
             }
             System.out.println();
             if(e.length>1)
             for(int i=1;i<e.length;i+=2)
             {
             System.out.print(e[i] + " ");	
             }
             else
             System.out.println();	
				
		}
			
	}
		
}*/
	

import java.util.*;
class Demo
{
  public static void main(String agrs[])
  {
       Scanner cin = new Scanner(System.in);
       int t =cin.nextInt();
       while(t-->0)
       {
        int a = cin.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<arr.length;i++)
        {
          arr[i] = cin.nextInt();
        }
        int b = cin.nextInt();
        int c = arr[b-1];
        for(int i=0;i<arr.length;i++)
        {
          for(int j=i;j<arr.length;j++)
          {
                    if(arr[i]>arr[j])
                    {
                      int temp = arr[i];
                      arr[i]= arr[j];
                      arr[j] = temp;
                    }
          }
         }
          for(int i=0;i<arr.length;i++)
          {
            if(c == arr[i] )
              System.out.println(i+1);
          }

       }
  }
}



















