import java.io.*;
class test
{
public static void main(String args[])throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
int num;
while(true)
{
num=Integer.parseInt(ob.readLine());
if(num!=42)
System.out.println(num);
else
break;
}
}
}