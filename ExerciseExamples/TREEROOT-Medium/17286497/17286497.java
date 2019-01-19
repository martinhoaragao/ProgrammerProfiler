import java.util.*;
import java.io.*;
import java.lang.*;
class id{
public static void main(String []args) throws Exception{
Scanner cin=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
int t=cin.nextInt();
while(t-->0){
int n=cin.nextInt();
long sum1=0;
long sum=0;
for(int i=0;i<n;i++){
int x=cin.nextInt();
int y=cin.nextInt();
sum1+=x;
sum+=y;
}
System.out.println(sum1-sum);
}
}
}