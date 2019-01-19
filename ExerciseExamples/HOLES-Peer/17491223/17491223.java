import java.util.*;
class HOLES {

	private static Scanner sc;
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T != 0){

			String s = sc.next();
			char sarray[] = s.toCharArray();
			
			int length = s.length();
			
			int i = 0;
			int count = 0;
			while(i < length){
				
				char temp = sarray[i];
				
				if(temp == 'B'){
					count += 2;
				}
				else if(temp == 'A' || temp == 'D' || temp == 'O' || temp == 'P' || temp == 'Q' || temp == 'R'){
					count += 1;
				}
				i++;
			}
			System.out.println(count);
			T--;
		}
	}

}
