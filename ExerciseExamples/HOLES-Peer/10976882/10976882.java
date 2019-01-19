import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HOLES {

    public static void main(String[] args) throws IOException {
	int letters[] = {1, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0};
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String str;
	char ch;
	int T = Integer.parseInt(in.readLine()), i, count, j, len;
	for (i = 1; i <= T; i++) {
	    count = 0;
	    str = in.readLine();
	    len = str.length();
	    for (j = 0; j < len; j++) {
		ch = str.charAt(j);
		if (ch >= 'A' && ch <= 'Z') {
		    count += letters[ch - 'A'];
		}
	    }
	    System.out.println(count);
	}

    }
}