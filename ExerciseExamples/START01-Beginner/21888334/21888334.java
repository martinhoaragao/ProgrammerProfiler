import java.util.Scanner;

class Beginner_NumMirror {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int inpnum = kb.nextInt();
		if ((inpnum >= 0) && (inpnum <= Math.pow(10, 5))) {
			System.out.print(inpnum);
		}
	}

}
