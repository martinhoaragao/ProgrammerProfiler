import java.io.BufferedReader;
import java.io.InputStreamReader;

class TEST {

    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a ;
        while(42!=(a=Integer.parseInt(r.readLine()))){
            System.out.println(a);
        }
    }
}