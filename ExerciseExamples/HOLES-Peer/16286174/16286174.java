import java.io.BufferedReader;
import java.io.InputStreamReader;

class CodeChef {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int T = Integer.parseInt(br.readLine());
			while (T > 0) {
				// A B C D E F G H I J K L M N O P Q R S T U V W X Y Z

				String s = br.readLine();
				char[] ch = s.toCharArray();
				int count = 0;
				for (int i = 0; i < ch.length; i++) {
					if (ch[i] == 'A' || ch[i] == 'D' || ch[i] == 'O' || ch[i] == 'P' || ch[i] == 'Q' || ch[i] == 'R') {
						count++;
					} else if (ch[i] == 'B') {
						count += 2;
					}
				}
				System.out.println(count);
				T--;
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception is :: " + e);
		}
	}

}
