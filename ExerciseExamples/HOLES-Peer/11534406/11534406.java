
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
 class holes
{
    public static void main(String[] args)
    {
        
        int i=0;
        Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       
        while(t!=0)
        {String s;
           s=sc.next();
           int count=0;
           for(i=0;i<s.length();i++)
           {  
               if(s.charAt(i)=='A' ||s.charAt(i)=='D'||s.charAt(i)=='O'||s.charAt(i)=='P'||s.charAt(i)=='R'||s.charAt(i)=='Q')
                  count++;
               
               else if( s.charAt(i)=='B')
                  count=count+2;
         }  
            System.out.println(count);
       t--; } 
      
    }
    
}
