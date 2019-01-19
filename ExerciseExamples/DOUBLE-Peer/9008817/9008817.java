import java.util.Scanner;
 class CodeChef{

	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int numberOfInputs = input.nextInt();
		int[] ar = new int[numberOfInputs];
		for(int i=0; i<numberOfInputs; i++)
		{
			int number = input.nextInt();
			if(number%2==0)
				ar[i]=number;
			else
				ar[i]=number-1;
		}
		input.close();
		for(int j=0; j<numberOfInputs; j++)
		{
			System.out.println(ar[j]);
		}
	}
}