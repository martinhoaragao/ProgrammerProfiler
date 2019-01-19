import java.util.Scanner;
class HolesInText {
	static Scanner sc = new Scanner(System.in);
	static int values[]={1,2,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0};
	public static void main(String args[]){
		int t=sc.nextInt();
		int res[]=new int[t];
		for(int j=0;j<t;j++){
			String s=sc.next();
			int count=0;
			for(int i=0;i<s.length();i++)
				count+=values[s.charAt(i)-65];
			res[j]=count;
		}
		for(int i:res)
			System.out.println(i);
	}
}