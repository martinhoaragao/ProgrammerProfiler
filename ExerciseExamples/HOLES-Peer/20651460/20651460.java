
import java.util.Scanner;

class main {
	

	public static void main(String[] args) {
Scanner s=new Scanner(System.in) ;
int t=s.nextInt();
for(int j=0;j<t;j++) {
String ss=s.next();
char []arr=new char[ss.length()];
for(int i=0;i<ss.length();i++) {
	arr[i]=ss.charAt(i);
}
System.out.println(fun(arr));

}		
		
	}
	static int fun(char []arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]=='A'||arr[i]=='Q'||arr[i]=='R'||arr[i]=='O'||arr[i]=='P'||arr[i]=='D') {
			sum+=1;
		}
		else{
			if(arr[i]=='B') {
				sum+=2;}
			
			}
		}
		return sum;
	}
	

	
}
