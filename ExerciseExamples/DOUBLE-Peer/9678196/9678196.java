

import java.util.Scanner;

 class doublestrings{ 

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	int i=0;
	while(i<t){
		int j=s.nextInt();
		if(j%2==0){
			System.out.println(j);
		}else{
			System.out.println(j-1);
		}
		t--;
		
	}
	}
}
