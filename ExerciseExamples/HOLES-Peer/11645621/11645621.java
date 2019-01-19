import java.util.*;
//Ayan Joshi

//Bongchi

class Report

{
    public static void main(String args[])
    
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t!=0)
        {
            String s = sc.next();
            int c=0,d= 0;
            for (int i = 0; i < s.length(); i++)
            {
            
                if(s.charAt(i)=='A'||s.charAt(i)=='D'||s.charAt(i)=='O'||s.charAt(i)=='P'||s.charAt(i)=='Q'||s.charAt(i)=='R')
                  {
                  	c++;
                  } 
                else if(s.charAt(i)=='B')
                {
                	d=d+2;
                }
            
           }
           
              System.out.println(d+c);
              c=0;d=0;
              
        t--;
        }
    }
}