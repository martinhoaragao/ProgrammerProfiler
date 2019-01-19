 import java.util.Scanner;
 class Main{
     public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         while(t-->0){
            int n=sc.nextInt();
            int ptr[]=new int[n+1];
            for(int i=1;i<=n;i++)
              ptr[i]=sc.nextInt();
              
              int k=sc.nextInt();
              
              int num=ptr[k];
              
              for(int i=1;i<=n;i++)
                for(int j=i+1;j<=n;j++)
                    if(ptr[i]>ptr[j])
                       ptr[i]=ptr[i]+ptr[j]-(ptr[j]=ptr[i]);
               
               int i=1;        
             for( i=1;i<=n;i++)
                if(ptr[i]==num)
                   break;
                   
                   System.out.println(i);
                   }
            }
     }       
                   
                       
            