import java.util.Scanner;

class detectOddNumber
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int i=input.nextInt();
        while(i!=42)
        {
            System.out.println(i);
            i=input.nextInt();
            
        }
    }
}