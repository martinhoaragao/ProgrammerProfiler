import java.util.Scanner;
class pool{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int t=in.nextInt();
for(int i=0;i<t;i++){
String a=in.next();
int l=0;
for(int k=0;k<a.length();k++){
if(a.charAt(k)=='R'){
l+=1;
}
if(a.charAt(k)=='P'){
l+=1;
}
if(a.charAt(k)=='O'){
l+=1;
}
if(a.charAt(k)=='D'){
l+=1;
}
if(a.charAt(k)=='A'){
l+=1;
}
if(a.charAt(k)=='B'){
l+=2;
}
if(a.charAt(k)=='Q'){
l+=1;
}
}
System.out.println(l);
}
}
}