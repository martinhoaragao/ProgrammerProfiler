
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);


        int amountRequired  = s.nextInt();
        Double currentBalance = s.nextDouble();

        if(amountRequired % 5==0){

            System.out.println(calculate(amountRequired,currentBalance,0.5));
        }else{
            System.out.println(currentBalance);
        }


    }


    private static Double calculate(int amountRequired,Double curentBalance,Double withdrawalCharges){

        if(curentBalance -  withdrawalCharges >= amountRequired){

            return curentBalance-amountRequired-withdrawalCharges;
        }
        else{

            return curentBalance;
        }

    }
}
