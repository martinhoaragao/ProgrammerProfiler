import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i=0; i<T; i++)
        {
            int holes=0;
            String s = in.next();
            for(int h=0; h<s.length(); h++)
            {
                if(s.charAt(h)=='A' || s.charAt(h)=='D' || s.charAt(h)=='O' || s.charAt(h)=='P' || s.charAt(h)=='Q' || s.charAt(h)=='R')
                {
                    holes+=1;
                }
                else if(s.charAt(h)=='B')
                {
                    holes+=2;
                }
            }
            System.out.println(holes);
        }
    }
}

