import java.util.*;
class Uncle{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int t=sc.nextInt();
while(t>0){
int j;
int n = sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
  a[i]=sc.nextInt();}
 int pos = sc.nextInt();
 int val=a[pos-1];
 Arrays.sort(a);
 for( j=0;j<n;j++){
 if(a[j]==val){
 break;}
 }
 System.out.println(j+1);
 t--;}
 }
 }
 
