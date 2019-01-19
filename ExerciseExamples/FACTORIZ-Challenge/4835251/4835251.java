import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main
{


public static void main (String[] args)
{
int t;
Scanner in=new Scanner(System.in);
t=in.nextInt();

while(t>0){
t--;
String str;
BigInteger i=new BigInteger("3");
BigInteger maxx=new BigInteger("6233");
Vector answer = new Vector();
str=in.next();
BigInteger n=new BigInteger(str);
if(n.compareTo(new BigInteger("1"))==0){
System.out.println(1);System.out.println(1);
return;
}

while(n.mod(new BigInteger("2")).equals(new BigInteger("0"))){
answer.addElement(new BigInteger("2"));
n=n.divide(new BigInteger("2"));
}

for( ;i.compareTo(n.min(maxx))==-1;i=i.add(new BigInteger("2")))
if(n.mod(i).equals(new BigInteger("0")))
while(n.mod(i).compareTo(new BigInteger("0"))==0){answer.addElement(i) ;n=n.divide(i);}

if(n.compareTo(new BigInteger("0"))==1) answer.addElement(n) ;
Enumeration it = answer.elements();System.out.println(answer.size());
while(it.hasMoreElements())System.out.println(it.nextElement().toString());System.out.println();



}

}
}
