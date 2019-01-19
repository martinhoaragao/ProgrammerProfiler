import java.util.Scanner;

class codechef1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int t,n;
		
		t=s.nextInt();
		
		while(t!=0){
			n=s.nextInt();
			if(n%2==0){
				System.out.println(n);
			}
			
			else{
				System.out.println(n-1);
			}
			
			t--;
		}
	}

}
