import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Main
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int t=in.nextInt();
int n;
while(t>0)
{
n=in.nextInt();
if(n%2==0)
{
System.out.println(n);
}
else
{System.out.println(n-1);}
t--;
}
}
}