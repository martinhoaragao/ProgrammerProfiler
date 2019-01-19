import java.util.Scanner;
class HOLES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner owny=new Scanner(System.in);
		int times=owny.nextInt();
		for(int repeat=1; repeat<=times; repeat++) {
			String input=owny.next();
			int number=0;
			int characterNum=input.length();
			for(int again=0; again<characterNum; again++) {
				char letter=input.charAt(again);
				if(letter=='A' || letter=='D' || letter=='O' || letter=='P' || letter=='R' || letter=='Q') {
					number=number+1;
				}
				else if(letter=='B') {
					number=number+2;
				}
			}
			System.out.println(number);
		}
	}

}
