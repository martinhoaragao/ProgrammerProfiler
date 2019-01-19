import java.util.Scanner;

class HolesInText {
	Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		HolesInText holesInText = new HolesInText();
		holesInText.ExecuteTestCase();
	}

	void ExecuteTestCase() {
		int testCase = GetInteger();
		while (testCase-- > 0) {
			String input = GetString();
			PrintOutput(GetNumberOfHoles(input));
		}
	}

	int GetNumberOfHoles(String string) {
		int holesCounter = 0;
		int lengthOfString = string.length();
		char[] charatersWithHoles = new char[] { 'A', 'B', 'D', 'Q', 'P', 'R', 'O' };
		for (int i = 0; i < lengthOfString; i++) {
			for (int j = 0; j < 7; j++) {
				if (string.charAt(i) == charatersWithHoles[j]) {
					holesCounter++;
				}
				if(string.charAt(i)=='B') {
					holesCounter = holesCounter +2;
					break;
				}
			}
		}
		return holesCounter;
	}

	void PrintOutput(int numberOfHoles) {
		System.out.println(numberOfHoles);
	}

	String GetString() {
		return scanner.next();
	}

	int GetInteger() {
		return scanner.nextInt();
	}
}
