import java.util.Scanner;
class HOLES
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();char c;sc.nextLine();
while(t-->0)
{int f=0;
String s=sc.nextLine();
for(int i=0;i<s.length();i++)
{c=s.charAt(i);
if(c=='A'||c=='D'||c=='O'||c=='P'||c=='R'||c=='Q')
f=f+1;
else if(c=='B')
f+=2;
}
System.out.println(f);
}
}
}   