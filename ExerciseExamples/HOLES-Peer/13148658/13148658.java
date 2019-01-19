import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		String[] arr=new String[t];
		for(int i=0;i<t;i++)
		{
			arr[i]=s.next();
		}
		int[] ans=new int[t];
    for(int i=0;i<t;i++)
    {
    	ans[i]=holes_in_text(arr[i]);
    }
    for(int i=0;i<t;i++)
    {
    	System.out.println(ans[i]);
    }
	}

	public static int holes_in_text( String str) {
		int ans=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='B')
			{
				ans+=2;
			}
			else if(str.charAt(i)=='A'||str.charAt(i)=='D'||str.charAt(i)=='O'||str.charAt(i)=='P'||str.charAt(i)=='R'||str.charAt(i)=='Q')
			{
				ans+=1;
			}
		}
		return ans;
	}

}