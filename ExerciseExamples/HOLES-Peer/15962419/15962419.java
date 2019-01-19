import java.io.*;
import java.util.*;

class Test {
	public static void main(String[] args) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int testCases ;
		testCases = Integer.parseInt(input.readLine());
		while (testCases != 0) {
			String str = input.readLine();
			int hole = 0;
			for (int i = 0 ; i < str.length(); i++) {
				char myChar = str.charAt(i);
				switch (myChar) {
				case 'A': {
					hole++;
					break;
				}
				case 'B': {
					hole += 2;
					break;
				}
				case 'D': {
					hole++;
					break;
				}
				case 'O': {
					hole++;
					break;
				}
				case 'P': {
					hole++;
					break;
				}
				case 'Q': {
					hole++;
					break;
				}
				case 'R': {
					hole++;
					break;
				}
				default: {

				}
				}
			}
			System.out.println(hole);
			testCases--;
		}
	}
}