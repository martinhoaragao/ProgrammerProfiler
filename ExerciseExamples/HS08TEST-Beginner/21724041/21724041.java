import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author jyao6429
 */
public class Main
{
	public static void main(String[] args)
	{
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		ATM solver = new ATM();
		solver.solve(1, in, out);
		out.close();
	}
	static class ATM
	{
		public void solve(int testNumber, Scanner in, PrintWriter out)
		{
			// Get input cases
			int withdraw = in.nextInt();
			double balance = in.nextDouble();

			// Checks if multiple of 5
			if (withdraw % 5 != 0)
			{
				out.printf("%.2f", balance);
				return;
			}

			// Add the withdrawal fee
			double totalWithdraw = withdraw + 0.5;

			// Checks if enough balance
			if (Double.compare(totalWithdraw, balance) > 0)
			{
				out.printf("%.2f", balance);
			}
			else
			{
				out.printf("%.2f", balance - totalWithdraw);
			}
		}

	}
}

