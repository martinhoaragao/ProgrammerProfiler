import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
    	int T = s.nextInt();
    	while(T-->0){
    		int N = s.nextInt(), ans = 0;
    		while(N-->0) ans += s.nextInt()-s.nextInt();
    		System.out.println(ans);
    	}
    }
}
