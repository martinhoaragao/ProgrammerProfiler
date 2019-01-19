
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        int T;
        Scanner input = new Scanner(System.in);
        T = input.nextInt();
        int  i=0;
        while(T!=0)
        {
         int length = input.nextInt();
            T--;
            if(length%2==0) {
                System.out.println(length);
            }
            else{
                System.out.println(length-1);
            }
                    
        }
       
       System.exit(0);
    }
}