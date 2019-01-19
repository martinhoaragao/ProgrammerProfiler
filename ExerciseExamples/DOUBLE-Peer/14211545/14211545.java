import java.util.Scanner;

class DoubleStrings{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		int numberOfTestCases = sc.nextInt();
		for(int i=0;i<numberOfTestCases;i++){
			
			int lengthOfPalindrome = sc.nextInt();
			if(lengthOfPalindrome%2!=0){
				System.out.println(lengthOfPalindrome-1);
			}
			else{
				System.out.println(lengthOfPalindrome);
			}
		}
	}
}