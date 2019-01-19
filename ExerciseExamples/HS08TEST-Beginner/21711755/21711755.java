import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float withdraw=s.nextFloat();
        float balance=s.nextFloat();

        if(withdraw%5!=0){
            System.out.println(balance);
        }else if(withdraw+0.50 > balance){
            System.out.println(balance);
        }else{
            System.out.printf("%.2f",balance-(withdraw+0.50));
        }

    }
}
