import java.io.*;
class HOLES
{
public static void main(String[]args)throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(b.readLine());char c;
while(t-->0)
{int f=0;
String s=b.readLine();
for(int i=0;i<s.length();i++)
{c=s.charAt(i);
if(c=='A'||c=='D'||c=='O'||c=='P'||c=='Q'||c=='R')
f=f+1;
else if(c=='B')
f+=2;
}
System.out.println(f);
}
}
}   