import java.util.Scanner;
 
//LYCC
class HOLES
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int count=0;
int t=sc.nextInt();
 for(int i=0;i<t;i++)
{
 
String s=sc.next();
char[] a=s.toCharArray();
for(int j=0;j<a.length;j++)
{
 
if(a[j]=='A' || a[j]=='D' || a[j]=='O' || a[j]=='P' || a[j]=='Q' || a[j]=='R') count++;
else if(a[j]=='B') count=count+2; 
 
 
 
 
}
 
System.out.println(count);
count=0;
 
 
 
 
}
 
 
 
 
 
 
}
 
 
 
 
 
 
} 