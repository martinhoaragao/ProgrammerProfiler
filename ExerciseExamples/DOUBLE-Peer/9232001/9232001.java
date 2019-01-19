import java.util.Scanner;

class sdouble {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int i,t,n;
		t=sc.nextInt();
		for(i=0;i<t;i++){
		n=sc.nextInt();
		if(n%2==0){
		System.out.println(n);
		}
		else{
		System.out.println(n-1);
		}


		}
		sc.close();

		}
}