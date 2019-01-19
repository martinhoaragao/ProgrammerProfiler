import java.util.*;
import java.lang.*;
import java.io.*;
class Atm
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        if(a%5==0 && (a+0.50)<b)
        {
            b=b-(a+0.50);
            System.out.format("%.2f",b);
            
        }
        else
            System.out.format("%.2f",b);
//if(a>b)
//System.out.format("%.2f",b);
        
    }
    
        
}