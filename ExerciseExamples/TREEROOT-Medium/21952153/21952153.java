import java.io.*;
import java.util.*;
import java.lang.*;
class chef{	
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt(); 

int n=30;
int id[]=new int[n]; 
int s[]=new int[n];
for(int i=0;i<t;i++){
	n=sc.nextInt();
	 int sumi=0;int sums=0;
	for(int j=0;j<n;j++){		
		sumi+=sc.nextInt();
		sums+=sc.nextInt();		
	}
	System.out.println(sumi-sums);	
}	
}
}