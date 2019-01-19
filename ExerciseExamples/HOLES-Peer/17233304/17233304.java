import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 class testcode
{
  public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i,len,test,j;
        test = Integer.parseInt(br.readLine());
        int coun = 0;
     while(test-->0) 
     {
         String s = br.readLine();
         len = s.length();
         coun = 0;
        for(i = 0; i < len; i++)
        {
            if(s.charAt(i)=='A'||s.charAt(i)=='D'||s.charAt(i)=='O'||s.charAt(i)=='P'||s.charAt(i)=='R'||s.charAt(i)=='Q')
            {
                  coun += 1;
            }
            else if (s.charAt(i)=='B')
            {
                coun += 2;
            }}
        System.out.println(coun);
        }
     }
   }

