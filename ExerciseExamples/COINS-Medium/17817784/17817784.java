import java.util.Scanner;
class Solution{
static long ans(long n){
long sum=n/2+n/3+n/4;
if(sum>n)
return ans(n/2)+ans(n/3)+ans(n/4);
else
return n;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
while(sc.hasNext())
{
long n=sc.nextLong();
System.out.println(ans(n));
}
sc.close();
}
} 