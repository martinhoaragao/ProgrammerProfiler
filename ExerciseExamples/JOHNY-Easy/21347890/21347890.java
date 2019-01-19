import java.util.*;	
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine().trim();
		int t = Integer.parseInt(s);
		for(int i = 0; i < t; i++) {
			String st = scanner.nextLine().trim();
			int n = Integer.parseInt(st);
			String[] str = scanner.nextLine().trim().split(" ");
			ArrayList<Long> arr = new ArrayList<>();
			for(int j = 0; j < n; j++) {
				arr.add(Long.parseLong(str[j]));
			}
			String string = scanner.nextLine().trim();
			int k = Integer.parseInt(string);
			long johny = arr.get(k-1);
			Collections.sort(arr);
			
			System.out.println(arr.indexOf(johny)+1);
		}
	}
}
