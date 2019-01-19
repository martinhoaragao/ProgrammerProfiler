import java.util.*;

 class holes {
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);


int t= sc.nextInt();
while(t!=0)
{
	
char ch[]=sc.next().toCharArray();

int s=0;

for(int i=0;i<ch.length;i++)
{
	
if(ch[i]=='A'||ch[i]=='D'||ch[i]=='O'||ch[i]=='P'||ch[i]=='R'||ch[i]=='Q')
{
	s=s+1;}
else if(ch[i]=='B')
{
	s=s+2;}


}

System.out.println(s);



t--;
}

}
}
