import java.util.Scanner;


 class Double_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int test=s.nextInt();
        while(test>0)
        {
        	int ele=s.nextInt();
        	if(ele%2==0)
        	{
        		System.out.println(ele);
        	}
        	else
        	{
        		System.out.println(ele-1);
        	}
        	test--;
        }
	}

}
