import java.util.*;
class codechef {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[100];
		int c=1,p=0;
		while(c!=0) {
			arr[c-1]=sc.nextInt();
			if(arr[c-1]==42) {
				arr[c]=sc.nextInt();
				p=c;
				c=-1;
			}
			c++;
		}
		for(int i=0;i<p-1;i++)
			System.out.println(arr[i]);
		
	}

}
