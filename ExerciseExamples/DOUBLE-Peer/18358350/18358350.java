import java.io.BufferedReader;
        import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int tst = Integer.parseInt(br.readLine());
        while(tst-->0) {
            int n = Integer.parseInt(br.readLine());
            if(n%2==0) System.out.println(n);
            else System.out.println(n-1);
        }
    }
}
