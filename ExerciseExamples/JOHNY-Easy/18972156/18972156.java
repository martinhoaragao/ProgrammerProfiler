import java.util.*;
class sol{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0){
int n=sc.nextInt();
int l[]=new int[n];
for(int i=0;i<n;i++){
l[i]=sc.nextInt();
}
int a=1;
int p=sc.nextInt();
for(int x:l){
if(x<l[p-1]) a++;
} 
System.out.println(a);
t--;
}
}
}