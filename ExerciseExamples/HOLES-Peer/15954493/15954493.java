import java.util.Scanner;

class Holes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-->0) {
			String inp = sc.next();
			char [] arr = inp.toCharArray();
			int count=0;
			for(int i=0;i<arr.length;i++) 
			{
				if(arr[i]=='B') 
				count=count+2;
				if(arr[i]=='A'||arr[i]=='D'||arr[i]=='O'||arr[i]=='P'||arr[i]=='Q'||arr[i]=='R')
					count++;
			}
			System.out.println(count);
		}
		sc.close();

	}

}
