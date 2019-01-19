import java.util.Scanner;

class HolesInTheText{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		int numberOfTestCases = sc.nextInt();
		for(int i=0;i<numberOfTestCases;i++){
			
			String str = sc.next();
			int holeCount = 0;
			
			for(int j=0;j<str.length();j++){
				char currentChar = str.charAt(j);
				if(currentChar=='A'||currentChar=='D'||currentChar=='O'||currentChar=='P'||currentChar=='Q'||currentChar=='R'){
					holeCount = holeCount + 1;
				}
				else if(currentChar=='B'){
					holeCount = holeCount + 2;
				}
				else{
					continue;
				}
			}
			System.out.println(holeCount);
		}
	}
}