import java.util.*;
public class Main{

public static void main(String args[]){


Scanner sc=new Scanner(System.in);
//System.out.println("no.of test");
int T=sc.nextInt();
while(T-->0){
	//System.out.println("no of elemets");
	int n=sc.nextInt();
int a[]= new int[n];
//System.out.println("elments");
for(int i=0;i<n;i++) {a[i]=sc.nextInt();}
int k=sc.nextInt();
int hj=a[k-1];
Arrays.sort(a);
for(int i=0;i<n;i++)
{ if(hj==a[i]){System.out.println(i+1); break;}
}






}




}





}
