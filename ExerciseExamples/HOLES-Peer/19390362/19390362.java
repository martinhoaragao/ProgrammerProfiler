import java.util.Scanner;
class SmallFactorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int i = 0 ; i < testCases ; i++)
        {
            String str = sc.next();
            int holes = 0;
            for(int j = 0 ;  j<str.length() ; j++)
            {
                if((str.charAt(j)+"").equals("A") ||(str.charAt(j)+"").equals("D") ||
                        (str.charAt(j)+"").equals("O") ||(str.charAt(j)+"").equals("P") ||
                        (str.charAt(j)+"").equals("R") || (str.charAt(j)+"").equals("Q"))
                    holes+=1;
                else if((str.charAt(j)+"").equals("B"))
                    holes+=2;
                else holes+=0;
            }
            System.out.println(holes);
        }

    }
}