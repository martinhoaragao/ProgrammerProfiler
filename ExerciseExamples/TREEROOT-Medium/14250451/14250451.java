import java.util.Scanner;

class Soluction {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt(); //number of tests
		int i=0; 
		
		while(i < t){
			int id=0; int sum=0;
			String temp = "";
			int n = in.nextInt();
			in.nextLine();
			for(int j=0; j< n ; j++)
			{
				temp = in.nextLine();
				id += Integer.parseInt(temp.substring(0, temp.indexOf(' ')));
				sum +=Integer.parseInt(temp.substring(temp.indexOf(' ')+1));
			}
			int ans = id - sum;
			System.out.println(ans);
			
			i++;
		}

	}

}
