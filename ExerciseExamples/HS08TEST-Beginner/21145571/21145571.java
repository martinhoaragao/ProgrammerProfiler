import java.util.*;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] str = scanner.nextLine().trim().split(" ");
		double x = Double.parseDouble(str[0]);
		double y = Double.parseDouble(str[1]);
		DecimalFormat df = new DecimalFormat(".##");
		
		if(x % 5 == 0 && x+0.5 <= y) {
			y = y - x - 0.5;
		}
		System.out.format("%.2f", y);
	}
}
