import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

class ATM {

	public static void main(String[] args) throws IOException {
		BigDecimal fees = new BigDecimal(0.5);
		Scanner sc = new Scanner(System.in);
		BigDecimal withdraw = sc.nextBigDecimal();
		BigDecimal balance = sc.nextBigDecimal();
		BigDecimal withdrawWithFee = withdraw.add(fees);
		if(withdrawWithFee.compareTo(balance) == 1				
						|| withdraw.remainder(BigDecimal.valueOf(5)).compareTo(BigDecimal.ZERO) != 0 ) {
			System.out.println(balance.setScale(2));
		}else {
			balance = balance.subtract(withdrawWithFee);
			System.out.println(balance.setScale(2));
		}
	}

}
