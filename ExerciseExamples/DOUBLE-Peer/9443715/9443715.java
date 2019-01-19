import java.util.Scanner;

class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
		int T = Integer.parseInt(temp);
		
		for(int i=0; i<T;i++){
			String test = sc.nextLine();
			int input = Integer.parseInt(test);
			
			if(input%2==0){
				System.out.println(input);
			}else{
				System.out.println(input-1);
			}

		}
	}
}
