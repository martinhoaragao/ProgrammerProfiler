import java.util.Scanner;


class Holes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the number of testcases:");
		int t=sc.nextInt();
		//int count=0;
		int[] count=new int[t];
		for(int j=0;j<t;j++){
		//System.out.println("Enter the text in caps:");
		String input=null;
		input=sc.next();
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)=='A'||input.charAt(i)=='D'||input.charAt(i)=='O'||input.charAt(i)=='P'||input.charAt(i)=='Q'||input.charAt(i)=='R'){
				count[j]++;
			}
			else if(input.charAt(i)=='B')
				count[j]+=2;
		}
		}
		
		for(int j=0;j<t;j++){
			System.out.println(count[j]);	
		}
	}

}
