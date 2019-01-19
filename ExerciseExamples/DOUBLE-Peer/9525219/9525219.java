import java.io.*;
class doublestring
{
public static void main(String args[])throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(in.readLine());
int n[]=new int[t];
int e=0;
for (int i=0;i<t;i++)
{e=Integer.parseInt(in.readLine());
if (e%2==0)
n[i]=e;
else
n[i]=e-1;
}
for (int i=0;i<t;i++)
System.out.println(n[i]);
}
}