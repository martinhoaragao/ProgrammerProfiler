import java.util.*;
import java.util.Arrays;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
while(t-->0){
int n=sc.nextInt();
int a[]=new int[n];
int i;
for(i=0;i<n;i++)
a[i]=sc.nextInt();
int k=sc.nextInt();
int in=a[k-1];
Arrays.sort(a);
for(i=0;i<n;i++){
if(a[i]==in){
System.out.println(i+1);
break;}}}}}