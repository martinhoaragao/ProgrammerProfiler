
import java.util.Scanner;

/**
 *
 * @author mshenawy
 */
public class Main {
    public static void main(String[] args) {
       	Scanner input=new Scanner(System.in);
 	    while(true){
        	int n=input.nextInt();
         	if(n==42)break;
         	System.out.println(n);
 	    }
    }
}