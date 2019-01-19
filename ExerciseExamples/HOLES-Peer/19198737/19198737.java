

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
		while(t-->0) {
		String s=sc.next();
		String s1[]=s.split("");
		int c=0;
		for (int i = 0; i < s1.length; i++) {
			switch(s1[i]) {
			case "A":c++;break;
			case "B":c=c+2;break;
			case "D":c++;break;
			case "O":c++;break;
			case "P":c++;break;
			case "Q":c++;break;
			case "R":c++;break;
			}
		}
		System.out.println(c);
	}

}
}