import java.util.Scanner;

class DoubleString{

	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int test_case , n , dsCount;
	
		test_case = in.nextInt();

		while(test_case > 0){
			dsCount=0;

			n = in.nextInt();
			
			if(n%2==0){
				dsCount = n;
			}
			else{
				dsCount = n-1;
			}
						
			System.out.println(dsCount);
			test_case--;

		}



	}





}