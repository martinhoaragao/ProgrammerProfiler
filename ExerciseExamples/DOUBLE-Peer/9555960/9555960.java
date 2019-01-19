

import java.util.Scanner;

class DoubleStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner sc=new Scanner(System.in);
		int test_cases=sc.nextInt();
		while(test_cases > 0)
		{
			int n=sc.nextInt();
			//int l=n-(n & 1);
		//	if (l != 10)
			if(n%2 == 0){
				System.out.println(n-(n & 1));
			}
			else
				System.out.println(n- 1);
			test_cases--;
		}
		System.exit(0);
		sc.close();
	}

}
