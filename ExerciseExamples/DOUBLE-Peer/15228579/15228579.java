import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main
{
	public static void main(String args[])
	{
	  Scanner in = new Scanner(System.in);
	  int t = in.nextInt();
          for(int i=0; i<t; i++)
          {
              int p = in.nextInt();
              if(p%2==0){System.out.println(p);}
              else{System.out.println(p-1);}
          }
	}
}