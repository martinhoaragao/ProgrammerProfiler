import java.util.*;


public class Main
{
    public static void main(String[] args)
    {
        char[] one_holed_letters = {'A', 'D', 'O', 'P', 'Q', 'R'};

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        sc.nextLine();
        while(t-- > 0)
        {
            String s = sc.nextLine();
            
            int count = 0;
            for(int i = 0; i < s.length(); i++)
            {
                if(s.charAt(i) == 'B')
                    count += 2;
                for(int j = 0; j < 6; j++)
                {
                    if((one_holed_letters[j]-s.charAt(i)) == 0)
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}