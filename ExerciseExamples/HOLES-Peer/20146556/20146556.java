import java.util.*;
class Holes{

public static void main(String args[]){

Scanner in=new Scanner(System.in);
int n=in.nextInt();
while(n-- >0){
String str=in.next();
int count=0;
int len=str.length();
for(int i=0;i<len;i++){
char ch=str.charAt(i);
if(ch=='B')
 count+=2;
else if(ch=='A'||ch=='D'||ch=='O'||ch=='P'||ch=='Q'||ch=='R')
 count++;
}
System.out.println(count);
}

}

}