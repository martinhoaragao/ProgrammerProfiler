import java.util.Scanner;

class AlphaHolesCheck{

	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int test_case , holeCount;
		char string[] = new char[100];
		test_case = in.nextInt();

		while(test_case > 0){
			holeCount=0;
			string = in.next().toCharArray();
			for(int i=0; i< string.length;i++){
				switch(string[i]){
					case 'A': holeCount++;
					break;
					case 'B': holeCount+=2;
					break;
					case 'D': holeCount++;
					break;
					case 'O': holeCount++;
					break;
					case 'P': holeCount++;
					break;
					case 'Q': holeCount++;
					break;
					case 'R': holeCount++;
					break;

				}

			}
			
			System.out.println(holeCount);
			test_case--;

		}



	}





}