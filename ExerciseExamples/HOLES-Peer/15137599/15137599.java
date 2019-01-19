import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int j=0;j<T;j++){
				String S = sc.next();
				int count = 0;
				for(int i=0;i<S.length();i++){
					if(S.charAt(i)=='A'||S.charAt(i)=='D'||S.charAt(i)=='O'||S.charAt(i)=='P'||S.charAt(i)=='R'||S.charAt(i)=='Q')
						count++;
					else if(S.charAt(i)=='B')
						count+=2;
				}
				System.out.println(count);
		}
	}

}