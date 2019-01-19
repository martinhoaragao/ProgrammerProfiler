import java.io.*;
import java.util.*;
class main{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t--!=0){
            int a,b,x,sum=0;
            x=sc.nextInt();
            while(x--!=0){
                a=sc.nextInt();
                b=sc.nextInt();
                sum+=(a-b);
            }
            System.out.println(sum);
        }
        sc.close();
        
    }
    
}