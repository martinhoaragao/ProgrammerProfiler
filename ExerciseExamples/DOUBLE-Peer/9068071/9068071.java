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
System.out.println(p-p%2);
t--;
}
}
} 