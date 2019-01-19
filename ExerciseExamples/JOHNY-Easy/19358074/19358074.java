import java.util.*;
 class Jhony
{
public static void main(String args[])
  { 
 try{  
    
    int item=0;
      Scanner sc=new Scanner(System.in);    
          int tc=sc.nextInt();
         
          while(tc>0)
          {
               int len=sc.nextInt();
                  int a[]=new int[len];
               for(int i=0;i<len;i++)
               {
                 a[i]=sc.nextInt();
               }
            int pos=sc.nextInt();
                item=a[pos-1];
                Arrays.sort(a);
                for(int j=0;j<len;j++)
                {
                 if(a[j]==item)
                 System.out.println(j+1);
                
                }
            tc=tc-1;
          }
          
    }     
    
    catch(Exception e)
    {
       System.out.println(e.getMessage());  
    }
 
  }
} 
