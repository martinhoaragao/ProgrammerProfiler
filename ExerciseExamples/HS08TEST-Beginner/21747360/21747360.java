import java.util.Scanner;

class ChefATM {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float amt,init,temp;
		
		amt = in.nextFloat();
		init=in.nextFloat();
		
		if(amt % 5 !=0)
		{
			temp=init;
		}
		else
		{
			temp = init - amt - 0.5f;
			if(temp<0)
			{
				temp=init;
			}
		}
		
		System.out.println(temp);
		in.close();
	}

}
