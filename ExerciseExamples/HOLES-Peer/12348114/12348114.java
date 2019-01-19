import java.util.*;
import java.lang.*;
import java.io.*;

class HoleProblem{
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int n = 0;
		n = sc.nextInt();
		while(n > 0){
			String inp = sc.next();
			int holes=0;
			for (int i = 0 ; i < inp.length() ; i++){
				if(inp.charAt(i)=='A'||inp.charAt(i)=='D'||inp.charAt(i)=='O'||inp.charAt(i)=='P'||inp.charAt(i)=='Q'||inp.charAt(i)=='R'){
					holes += 1;
				}else if(inp.charAt(i)=='B'){
					holes += 2;
				}
			}
			n--;
			System.out.println(holes);
		}
	}
}
