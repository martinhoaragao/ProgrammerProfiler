import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
class Stt {
	public static void main(String args[]) {
		int i,n,j,sum;
		String str;
		char ch;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++){
			str=sc.next();
			sum=0;
			for(j=0;j<str.length();j++){
				ch=str.charAt(j);
				if(ch=='A'||ch=='D'||ch=='O'||ch=='P'||ch=='Q'||ch=='R'){sum+=1;}
				else if(ch=='B'){sum+=2;}
			}
			System.out.println(sum);
		}
	}
}