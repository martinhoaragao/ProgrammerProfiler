import java.util.Scanner;
import java.util.Arrays;
class chef{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
int t = s.nextInt();
while(t-->0){
int N = s.nextInt();
int[] arra = new int[N];
for(int i=0;i<N;i++)
arra[i] = s.nextInt();
int K = s.nextInt();
int uncle = arra[K-1];
Arrays.sort(arra);
int j=0;
for(int i=0;i<N;i++){
if(arra[i]==uncle){
j=i; 
break;
}
}
System.out.println(j+1);
}
}
}