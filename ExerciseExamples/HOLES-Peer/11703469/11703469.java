import java.util.Scanner;
class Holes {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t--!=0){
			String a=sc.nextLine();
			int count=0;
			for(int i=0;i<a.length();i++){
				char c=a.charAt(i);
				if(c=='A'||c=='D'||c=='O'||c=='P'||c=='Q'||c=='R'){
					count++;
				}
				else if(c=='B'){
					count=count+2;
				}
			}
			System.out.println(count);
		}
	}
}