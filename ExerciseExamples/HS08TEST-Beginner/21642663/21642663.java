import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author devesh
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ATM solver = new ATM();
        solver.solve(1, in, out);
        out.close();
    }

    static class ATM {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            double withdrawAmt = in.nextInt();
            double balance = in.nextDouble();
            if (withdrawAmt % 5 == 0 && balance >= (withdrawAmt + 0.50)) {
                balance -= withdrawAmt;
                out.printf("%.2f", (balance - 0.50));
            } else
                out.printf("%.2f", balance);
        }

    }
}

