
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;


class Solution {


    public static void main(String[] args) throws IOException {
        FastInput input = new FastInput();
        final StringBuilder stringBuilder = new StringBuilder();
        int t = input.nextInt();
        while (t-->0) {
            int n = input.nextInt();
            int[] songs = new int[n];

            for (int i = 0; i <n ; i++) {
               songs[i]= input.nextInt();
            }
            int uncle = songs[input.nextInt()-1];
            stableSort(songs);
            stringBuilder.append(Arrays.binarySearch(songs,uncle)+1).append("\n");
        }
        System.out.println(stringBuilder);
    }


    private static void stableSort(int[] a){
        int n =a.length;

        for (int i = 1; i <n ; i++) {
            int j =i-1;
            int value = a[i];
            while (j>=0 && a[j]>value){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] =value;
        }
    }

}

class FastInput{
    private BufferedReader br;
    private StringTokenizer st;
    FastInput(){
        br = new BufferedReader(
                new InputStreamReader(System.in)
        );
    }

    String next(){
        while (st == null || !st.hasMoreElements()){
            try {
                st = new StringTokenizer(br.readLine());
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
    int nextInt(){
        return Integer.parseInt(next());
    }
    long nextLong(){
        return Long.parseLong(next());
    }
    double nextDouble(){
        return Double.parseDouble(next());
    }
    String nextLine(){
        String str ="";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    BigInteger nextBigInteger(){
        return BigInteger.valueOf(nextLong());
    }

}
