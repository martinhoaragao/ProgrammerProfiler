import java.util.*;
class holes
{
public static void main(String args[])
{
Scanner br=new Scanner(System.in);
int t=br.nextInt();
while(t-->0)
{
int c=0;
String s=br.next();
for(int i=0;i<s.length();i++)
if(s.charAt(i)=='A' ||s.charAt(i)=='D' ||s.charAt(i)=='O' ||s.charAt(i)=='P' ||s.charAt(i)=='Q' ||s.charAt(i)=='R')
c=c+1;
else if(s.charAt(i)=='B')
c=c+2;
System.out.println(c);
}
}
}