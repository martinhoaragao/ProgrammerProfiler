import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
			String s= sc.next().toUpperCase();
			int  count = 0;
			for(int i=0; i<s.length(); i++){
				char c = s.charAt(i);
				if(c=='Q'||c=='R'||c=='O'||c=='P'||c=='A'||c=='D'){
					count++;
				}else if(c=='B'){
					count += 2;
				}
			}
			System.out.println(count);
		}
	}
}