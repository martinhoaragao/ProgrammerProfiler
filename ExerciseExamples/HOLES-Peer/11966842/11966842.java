import java.util.*;
public class Main{

public static void main(String[] args){
	
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
			String str=s.next();
			int holes=0;
			for(int i=0; i<str.length(); i++){
				holes+=getHoles(str.charAt(i));
			}
			System.out.println(holes);
		}
	
}

private static int getHoles(char c){
		if(c=='A' || c=='D' || c=='O' || c=='P' || c=='R' || c=='Q'){
			return 1;
		}
		if(c=='B'){
			return 2;
		}
		return 0;
	}

}