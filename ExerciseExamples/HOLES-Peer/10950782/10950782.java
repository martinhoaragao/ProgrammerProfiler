import java.util.Scanner;
class HOLES
{
static char H1[]={'A','D','O','P','Q','R'};
static char H2='B';
static Scanner s = new Scanner(System.in);

static int belongsToH(char c)
{int nc=0;
if(c==H2)return 2;
for(int x=0;x<6;x++)if(c==H1[x])return 1;
return 0;
}

public static void main(String args[])
{
int t = s.nextInt();
int c=0;
String ip=s.nextLine();
while(t-->0)
{
ip=s.nextLine();
for(int x=0;x<ip.length();x++)c+=belongsToH(ip.charAt(x));
System.out.println(c);
c=0;
}
}
}