import java.io.*;
import java.util.*;

class TREEROOT{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int d,i,j,x,y,n,sum,t;
		long m1,m2;

		t=sc.nextInt();
		for(i=0;i<t;i++){
			sum=0;
			n=sc.nextInt();
			for(j=0;j<n;j++){
				x=sc.nextInt();
				y=sc.nextInt();
				sum+=x-y;
			}
			System.out.println(sum);
		}
	}
}