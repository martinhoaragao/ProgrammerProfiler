	import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
 
class Solution{
public static long break1(long n){
long n1=n/2,n2=n/3,n3=n/4,max=n,sum=0;
if(n1+n2+n3>max)
max=n1+n2+n3;
if(n1>10)
{
n1=break1(n1);
sum=n1+n2+n3;
if(sum>max)
max=sum;
}
if(n2>10)
{
n2=break1(n2);
sum=n1+n2+n3;
if(sum>max)
max=sum;
}
if(n3>10)
{
n3=break1(n3);
sum=n1+n2+n3;
if(sum>max)
max=sum;
}
return max;
}
public static void main(String args[]){;
Scanner sc=new Scanner(System.in);
while(sc.hasNext()){
long n=sc.nextLong(),num=n;
long n1=break1(n/2);
long n2=break1(n/3);
long n3=break1(n/4);
if(n1+n2+n3>num)
System.out.println(n1+n2+n3);

else
System.out.println(num);
}
}
}
