import java.util.Scanner;
class HolesInTheText {

	public static void main(String[] args) {
	Scanner ayden=new Scanner(System.in);
	int alisa=ayden.nextInt();
	for(int kevin=1;kevin<=alisa;kevin++) {
	String input=ayden.next();
	int number=0;
	int characterNum=input.length();
	for(int again=0;again<characterNum;again++) {
	char bob=input.charAt(again);
	if(bob=='A' || bob=='D' || bob=='O'||bob=='P'||bob=='R'||bob=='Q') {
	number++;
	}
	else if(bob=='B') {
	number+=2;
	

	}
	}
	System.out.println(number);
	}
	}

}