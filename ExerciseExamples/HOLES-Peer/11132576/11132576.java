import java.io.*;
import java.util.*;
class srk{
public static void main(String args[])throws IOException{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int t=Integer.parseInt(in.readLine());
String s;
int i,p,q;
char c;
for(int zz=0;zz<t;zz++)
{p=0;
 s=in.readLine();
 s=s.toUpperCase();
 for(i=0;i<s.length();i++)
 {c=s.charAt(i);
  if(c=='A')
  {p++;}
  else if(c=='B')
  {p=p+2;}
  else if(c=='D')
  {p++;}
  else if(c=='O')
  {p++;}
  else if(c=='P')
  {p++;}
  else if(c=='Q')
  {p++;}
  else if(c=='R')
  {p++;}
  else{p=p;}
  }
  System.out.println(p);
  }}}