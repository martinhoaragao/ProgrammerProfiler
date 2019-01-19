import java.io.*;
class chef
{
public static void main(String [] args) throws IOException
{
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
int t =Integer.parseInt(br.readLine());
while(t>0)
{
int p =Integer.parseInt(br.readLine());
if(p%2==0)
{System.out.println(p);}
else
{System.out.println(p-1);}
t--;
}
}
}