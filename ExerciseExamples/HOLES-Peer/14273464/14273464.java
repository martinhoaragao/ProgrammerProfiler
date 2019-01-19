import java.util.*;
class holes{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		int t,i,n,j;
		t=obj.nextInt();
		String x;
		for(i=0;i<t;i++){
			int c=0;
			x=obj.next();
			n=x.length();
			for(j=0;j<n;j++){
			if(x.charAt(j)=='B')
			c+=2;
			else if(x.charAt(j)=='A' ||x.charAt(j)=='D'||x.charAt(j)=='O'||x.charAt(j)=='P'||x.charAt(j)=='Q'||x.charAt(j)=='R')
			c++;
			}
			System.out.println(c);
		}
		obj.close();
	}
}