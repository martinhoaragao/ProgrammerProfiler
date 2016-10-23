

import java.io.*;
import java.util.*;
import java.lang.*;
public class Ex2
{
   public int ex2(int M , int N){
       int i;
       int j;
       int total=0;
       Scanner sc = new Scanner(System.in);
       for(i=0;i<N;i++){
           j=sc.nextInt();
           if(j>M)System.out.println(j);
           total= total + j;
        
        }
       System.out.println(total);
       return 0;
    }
}
