import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
public class Main
{
public static void main(String args[])throws Exception
{
int i,j,t;
int pro,k=0;
boolean val[]=new boolean[10005];
long prime[]=new long[10005];
int p=(int)Math.sqrt(10005);
val[0]=false;
val[0]=false;
for(i=2;i<10005;i++)
 val[i]=true;
for(i=2;i<=p;i++)
{
if(val[i]==true)
{
for(j=i;;j++)
{
pro=i*j;
if(pro>10004)
 break;
val[pro]=false;
}
}
}
for(i=2;i<10005;i++)
{
if(val[i]==true)
 prime[k++]=i;
}
BufferedReader inp1=new BufferedReader(new InputStreamReader(System.in));
t=Integer.parseInt(inp1.readLine());
String res;
BigInteger inp, temp;
while(t-->0)
{
int count=0;
res="";
inp=new BigInteger(inp1.readLine());
for(i=0;i<k;i++)
{

temp=BigInteger.valueOf(prime[i]);
while((inp.mod(temp)).equals(BigInteger.ZERO))
{
     res +=prime[i]+"\n";
    inp=inp.divide(temp);
    ++count;
}
}
    if(!inp.equals(BigInteger.ONE)) {res += inp + "\n"; ++count;}
            System.out.print(count + "\n" + res);
}
}
}