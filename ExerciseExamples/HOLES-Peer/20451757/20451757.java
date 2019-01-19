import java.util.* ;
import java.io.* ;
import java.lang.* ;
public class Main 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in) ;
        int T = in.nextInt() ;
        for(int o = 0 ; o < T ; o++)
        {
            String s = in.next() ;
            int n = 0 ;
            char c1 ;
            for(int i = 0 ; i < s.length() ; i++)
            {
                c1 = s.charAt(i) ;
                if(c1 == 'A'|| c1 == 'Q'|| c1 == 'R'|| c1 == 'O'|| c1 == 'P'|| c1 == 'D')
                n++ ;
                if(c1 == 'B')
                n = n + 2 ;
            }
            System.out.println(n) ;
        }
    }
}