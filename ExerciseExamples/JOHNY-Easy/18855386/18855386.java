import java.util.*;
import java.io.*;

class solution
{
public static void main(String arg[])throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
for(int i=0;i<t;i++)
{
int n=Integer.parseInt(br.readLine());
String s=br.readLine();
String ss[]=s.split(" ");
int index=Integer.parseInt(br.readLine());
index--;
int ar[]=new int[n];
int val=0;
for(int j=0;j<n;j++)
{
ar[j]=Integer.parseInt(ss[j]);
if(j==index)val=ar[j];
}
Arrays.sort(ar);
int j;
for(j=0;j<n;j++)
{
if(ar[j]==val)
{j++;
System.out.println(j);}
}

}
}
}