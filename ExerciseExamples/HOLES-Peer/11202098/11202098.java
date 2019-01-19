import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args)throws IOException
     {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int t=Integer.parseInt(in.readLine());
        String s;
        int c;
        char ch;
        while(t>0)
            {c=0;
            s=in.readLine();
            for(int i=0;i<s.length();i++)
                {
                ch=s.charAt(i);
                if(ch=='A')
                {c++;}
                else if(ch=='B')
                {c=c+2;}
                else if(ch=='D')
                {c++;}
                 else if(ch=='O')
                {c++;}
                 else if(ch=='P')
                {c++;}
                 else if(ch=='Q')
                {c++;}
                 else if(ch=='R')
                {c++;}
                 else 
                {c=c;}
                
                
            }
            
            
            
            
            System.out.println(c);
        t--;}
    }
}
