import java.util.*;
class Holes{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while(tests-->0){
		String st = sc.next();
		int count=0;
		for(int i=0;i<st.length();i++){
			if(st.charAt(i)=='A'||st.charAt(i)=='D'||st.charAt(i)=='O'||st.charAt(i)=='P'||st.charAt(i)=='Q'||st.charAt(i)=='R'){
				count++;
			}else if(st.charAt(i)=='B')
				count+=2;
		}
		System.out.println(count);
	}
}}