import java.util.*;
class HOLES{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
			String s = sc.next();
			String H1 = "ADOPQR";
			int count=0;
			for(int i=0;i<s.length();i++){
				char ch = s.charAt(i);
				if(H1.indexOf(ch)>=0) count++;
				else if(ch=='B') count+=2;
			}
			System.out.println(count);
		}
	}
}