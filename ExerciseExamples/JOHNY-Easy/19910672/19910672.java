import java.util.*;
class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int len = sc.nextInt();
			int[] arr = new int[len];
			for (int i = 0; i < len; i++)
				arr[i] = sc.nextInt();
			int i = sc.nextInt();
			int ans = arr[i-1];
			Arrays.sort(arr);
			for (int j = 0; j < arr.length; j++) {
				if (ans == arr[j]) {
					System.out.println(j+1);break;
				}
			}
			
		}
	}
}