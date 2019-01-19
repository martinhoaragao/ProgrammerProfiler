import java.util.Scanner; 
class Test {

	public static void main(String[] args) {
		int num;
		Scanner n=new Scanner(System.in);
		while(true){
		num=n.nextInt();
		if(num!=42) 
			System.out.println(num);
		else {
            System.exit(0);
		}
			}
		
	}

}
