import java.util.*;
import java.io.*;
 
class Codechef{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int T = sc.nextInt();
while(T>0){
int n = sc.nextInt();
int[] arr = new int[n];
for(int i=0;i<n;i++)
	arr[i] = sc.nextInt();
int k = sc.nextInt();
int copy = arr[k-1];
//Arrays.sort(arr);
int i;int count=0;
for(i=0;i<n;i++){
	if(arr[i]<copy){
		count++;
	}
}
System.out.println(count+1);
 
T--;
}	//while loop of testcase ends here.
 
}
} 