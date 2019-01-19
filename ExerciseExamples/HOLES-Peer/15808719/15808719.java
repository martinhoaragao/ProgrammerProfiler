import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HOLES {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            String temp = in.readLine();
            int i, count=0, len = temp.length();
            for(i=0;i<len;i++)
                if(temp.charAt(i)=='A' || temp.charAt(i)=='D' || temp.charAt(i)=='O' || temp.charAt(i)=='P' || temp.charAt(i)=='Q' || temp.charAt(i)=='R')
                    count++;
                else if(temp.charAt(i)=='B')
                    count+=2;
            System.out.println(count);
        }
    }
}
