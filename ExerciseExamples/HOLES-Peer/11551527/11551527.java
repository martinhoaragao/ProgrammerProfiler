import java.util.*;
class AB{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		while(T!=0){
			String s = sc.next();
			char [] ch = new char[s.length()];
			ch = s.toCharArray();
			int count = 0;
			for(int i=0;i<s.length();i++){
				if(ch[i] == 'A' || ch[i] == 'D' || ch[i] == 'O' || ch[i] == 'P' || ch[i] == 'Q' || ch[i] == 'R'){
					count = count+1;
				}else if(ch[i] == 'B'){
					count = count+2;
				}
			}
			System.out.println(count);
		T--;
		}
	}

	
}