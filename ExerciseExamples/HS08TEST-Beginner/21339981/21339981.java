import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=1;
        for(int i=0;i<t;i++)
        {

         int x=sc.nextInt();
          double y=sc.nextDouble();
          double z=0.50;
            if(x+z<=y)
            {
                if(x%5==0)
                {
                    String str= String.format("%.2f",y-x-z );
                    System.out.println(str);
                }
                else
                {
                    String str= String.format("%.2f",y );
                    System.out.println(str);
                }
            }
            else
            {
                String str= String.format("%.2f",y );
                System.out.println(str);
            }
        }
    }
}
