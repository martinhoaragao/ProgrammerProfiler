import java.util.Scanner;


class DoubleStrings {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int testnum =s.nextInt();
	for(int i=0;i<testnum;i++) {
		System.out.println(popResult(s.nextInt()));
	}
	s.close();
}

static int popResult(int n) {
	if (n==0||n==1) return 0;
	if (n%2==0) return n;
	else return n-1;
}

}
