import java.util.*;
public class Main{
	public static int f(char c){
		if(c=='A'||c=='D'||c=='O'||c=='P'||c=='Q'||c=='R')
		return 1;
		if(c=='B') return 2;
		else return 0;
	}
	public static int g(String s){
	int x=0;
	for(int i=0;i<s.length();i++){
	x=x+f(s.charAt(i));
	}
	return x;
	}
	public static void main(String args[]){
	Scanner e=new Scanner(System.in);
	String s=e.nextLine();
	int t=Integer.parseInt(s);
	for(int i=0;i<t;i++){
	String x=e.nextLine();
	System.out.println(g(x));
	}
	}
}