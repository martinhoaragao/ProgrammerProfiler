import java.util.*;
class a{
public static void main(String arf[]){
Scanner in=new Scanner(System.in);
int t=in.nextInt();
while(t-->0){
int n=in.nextInt();
int sum=0;
while(n-->0){
sum+=in.nextInt()-in.nextInt();
}
System.out.println(sum);
}}}