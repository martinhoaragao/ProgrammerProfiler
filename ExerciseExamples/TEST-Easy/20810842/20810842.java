import java.util.Scanner;
class Uni
{
    public static void main(String args[])
    {
        int x;
        Scanner in = new Scanner(System.in);
        while(true)
        {
            x= in.nextInt();
            if (x==42)
            {
                break;
            
            }
            System.out.println(x);
        }
        
    }


}