import java.io.*;

class COINS {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            while(true) {
                int n = Integer.parseInt(in.readLine());
                long res = decompose(n);
                if(res>n)
                    System.out.println(res);
                else
                    System.out.println(n);
            }
        }catch (Exception e){

        }
    }
    static long decompose(int n){
        return n<12?n:decompose(n/4)+decompose(n/3)+decompose(n/2);
    }
}