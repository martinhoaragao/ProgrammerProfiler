
//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author mshenawy
 */
public class Main {
    public static void main(String[] args)throws IOException {
       	// Scanner input=new Scanner(System.in);
       	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         
 	    while(true){
        // 	int n=input.nextInt();
        int n=Integer.parseInt(br.readLine());
         	if(n==42)break;
         	System.out.println(n);
        
 	    }
    }
}