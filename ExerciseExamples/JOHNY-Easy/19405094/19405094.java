import java.io.*;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        
        Scanner src=new Scanner(System.in);
        int t=src.nextInt();
        int p;
        int res[]=new int[t];
        for(int z=0;z<t;z++)
        {
            int n=src.nextInt();
            int ab[]=new int[n];
            for(int i=0;i<n;i++)
                ab[i]=src.nextInt();
            int v=src.nextInt();
            int pos=ab[v-1];
            for(int i=0;i<n-1;i++)
            {
                for(int k=i+1;k<n;k++)
                {
                    if(ab[i]>ab[k])
                    {
                        p=ab[i];
                        ab[i]=ab[k];
                        ab[k]=p;
                    }

                }
            }
           
            for(int i=0;i<n;i++)
                if(ab[i]==pos)
                {
                    res[z]=i+1;
                    break;
                }
        }
        for(int j=0;j<t;j++)
            System.out.println(res[j]);
        
        
        
    }
        
        
        
}
