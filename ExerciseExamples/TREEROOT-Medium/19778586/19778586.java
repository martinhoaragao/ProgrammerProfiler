
import java.io.*;
import java.math.BigInteger;
import java.util.*;

class Main {
    private static final int delta = (int) 1e9 + 7;
    private static FastReader scn;
    private static OutputStream out;
    private static HashMap<Object, Integer> count;


    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    private void print(Object str) throws IOException {
        out.write(str.toString().getBytes());
    }

    private void println(Object str) throws IOException {
        out.write((str.toString() + "\n").getBytes());
    }

    private void run() throws IOException {
        scn = new FastReader();
        out = new BufferedOutputStream(System.out);
        solve();
        out.flush();
        out.close();
    }

    private void printArray(int[] array) throws IOException {
        for (Object element : array)
            print(element + " ");
        println("");
    }


    void addToMap(Object a) {
        if (!count.containsKey(a))
            count.put(a, 1);
        else
            count.put(a, count.get(a) + 1);
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int[] inputArray(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();
        return arr;
    }

    class FastReader {
        BufferedReader br;
        StringTokenizer st;

        private FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    private void reverse(int[] arr) {
        for (int i = 0; i < (arr.length / 2); i++)
            swap(arr, i, arr.length - i - 1);
    }

    long add(long a, long b) {
        return add(a, b, delta);
    }

    long add(long a, long b, long mod) {
        return ((a % mod) + (b % mod)) % mod;
    }

    long multiply(long a, long b) {
        return ((a % delta) * (b % delta)) % delta;
    }


    private long gcd(long a, long b) {
        if (a == 0 || b == 0)
            return a == 0 ? b : a;
        return gcd(b, a % b);
    }

    private int kadane(int[] arr) {
        int a = arr[0];
        int b = arr[0];
        for (int i = 1; i < arr.length; i++) {
            b += arr[i % arr.length];
            if (b > a)
                a = b;
            if (b < 0)
                b = 0;
        }
        return a;
    }

    private long sumArray(int[] arr) {
        long sum = 0;
        for (int val : arr) {
            sum += val;
        }
        return sum;
    }

    private void solve() throws IOException {
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int ids[] = new int[n];
            int sids[] = new int[n];
            for (int i = 0; i < n; i++) {
                ids[i] = scn.nextInt();
                sids[i] = scn.nextInt();
            }
            println(sumArray(ids) - sumArray(sids));
        }
    }
}

