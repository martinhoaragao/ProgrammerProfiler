import java.util.Scanner;
class Student
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0)
        {
            String str=sc.next();
            int len=str.length();
            int sum=0;
            for(int i=0;i<len;i++)
            {
                if(str.charAt(i)=='A')  sum=sum+1;
                if(str.charAt(i)=='B')  sum=sum+2;
                if(str.charAt(i)=='D')  sum=sum+1;
                if(str.charAt(i)=='O')  sum=sum+1;
                if(str.charAt(i)=='P')  sum=sum+1;
                if(str.charAt(i)=='R')  sum=sum+1;
                if(str.charAt(i)=='Q')  sum=sum+1;
                
            }
            System.out.println(sum);
        }
    }
}