import java.io.*;
import java.util.*;
class root{
public static void main(String args[])throws IOException{
root ob=new root();
ob.processing();
}
public static void processing()throws IOException{
Scanner cons=new Scanner(System.in);
int t,n,swr,swtr;
//System.out.println("Lets test!");
t=cons.nextInt();
for(int i=1;i<=t;i++){
swr=0;
swtr=0;
n=cons.nextInt();
int a,b;
for(int j=1;j<=n;j++){
a=cons.nextInt();
b=cons.nextInt();
swr+=a;
swtr+=b;
}
System.out.println(swr-swtr);
}
}} 