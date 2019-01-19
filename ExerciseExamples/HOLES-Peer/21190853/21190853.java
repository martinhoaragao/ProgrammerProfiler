import java.util.*;
class HOLES{
public static void sol(String s){
int k=s.length();
int count=0;
for(int i=0;i<k;i++){
if(s.charAt(i)== 'A' ||s.charAt(i)== 'D' ||s.charAt(i)== 'O'||s.charAt(i)=='P'||s.charAt(i)=='Q'||s.charAt(i)=='R')
{
count++;
}
else if(s.charAt(i)=='B'){
count+=2;
}

}
System.out.println(count);



}

public static void main(String args[]){
Scanner obj=new Scanner(System.in);
int t=obj.nextInt();
String space=obj.nextLine();
for(int i=0;i<t;i++){
String s=obj.nextLine();
sol(s);
}

}



}