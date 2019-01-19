import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Arrays;
class ATM{
	public static void main(String ar[])throws IOException{
//	Scanner sc=new Scanner(System.in);
	BufferedReader br = new BufferedReader(
                              new InputStreamReader(System.in));
		 String ip1[]=br.readLine().split("\\s");
		 double amount=Double.parseDouble(ip1[0]);
		 double balance=Double.parseDouble(ip1[1]);
		 br.close();
		 if(amount%5==0){
		 if(amount+0.50<=balance){
		 	balance=balance-(amount+0.50);
		 	System.out.println(balance);
		 }else System.out.println(balance);
		 }else System.out.println(balance);
		 
}}
