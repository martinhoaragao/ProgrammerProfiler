import java.util.*;


public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	for(int i=0;;i++){
    		int n = sc.nextInt();
    		if(n!=42){
    			System.out.println(n);
    		}
    		else if(n==42){
    			break;
    		}
    	}
    }
}
