import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Codechef1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		
		Pattern p=Pattern.compile("42");
		while(true)
		{
			Matcher m=p.matcher(input);
			if(m.find()) {
				input=sc.nextLine();
				System.exit(0);}
			else {
				System.out.println(input);
				input=sc.nextLine();}
		}
	}
}