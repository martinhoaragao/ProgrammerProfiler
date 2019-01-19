import java.util.*;
class ds
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
int in[]=new int[t];
int out[]=new int[t];
for(int i=0;i<t;i++)
{in[i]=sc.nextInt();
if(in[i]%2==0)
out[i]=in[i];
else
out[i]=(in[i]-1);
}
for(int i=0;i<t;i++)
System.out.println(out[i]);
}
}
