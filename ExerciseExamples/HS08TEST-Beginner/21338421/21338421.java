import java.io.*;

public class Main {
    public static void main(String [] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter p = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String[] sr = br.readLine().split(" ");
        int cash = Integer.parseInt(sr[0]);
        double balance = Double.parseDouble(sr[1]);
        if(cash%5 == 0 && balance>cash + 0.5){
            p.printf("%.2f\n", balance-cash-0.50);
            p.flush();

        } else{
            p.printf("%.2f\n", balance);
            p.flush();
        }
    }
}