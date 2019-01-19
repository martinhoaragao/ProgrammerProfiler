import java.util.Scanner;

class HOLES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		for(int i=0;i<t;i++){
			String str=scn.next();
			int rv=0;
			for(int j=0;j<str.length();j++){
				char ch=str.charAt(j);
				
				if(ch=='A' || ch=='D' || ch=='O' || ch=='P' || ch=='Q' || ch=='R'){
					rv++;
				}else if(ch=='B'){
					rv+=2;
				}
				
			}
			System.out.println(rv);
		}
	}

}
