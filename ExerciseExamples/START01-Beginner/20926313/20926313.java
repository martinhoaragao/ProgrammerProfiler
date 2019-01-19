import java.io.BufferedReader;
import java.io.InputStreamReader;

class NumberMirror {


    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader r = new java.io.BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = r.readLine())!=null)
            System.out.println(s);
    }
}
