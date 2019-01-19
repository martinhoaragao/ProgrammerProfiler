import java.util.Scanner;
 
class Chefglove {
 
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
int T=s.nextInt();
String s2=s.nextLine();
for(int i=1;i<=T;i++)
{
String s1=s.nextLine();
int l=s1.length();int sum=0;
for(int j=0;j<l;j++)
{
char ch=s1.charAt(j);
if(ch=='A' || ch=='D' || ch=='O' || ch=='P' || ch=='Q' ||ch=='R')
sum+=1;
else if(ch=='B')
sum+=2;
}
System.out.println(sum);
        
    }
    
}}
 