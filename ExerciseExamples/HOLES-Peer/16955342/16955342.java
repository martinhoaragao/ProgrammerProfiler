import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;
import java.math.*;
import java.util.StringTokenizer;
class holesInText {
    static PrintStream p = System.out;
    public static void main(String args[] ) throws Exception {
        FastReader scan=new FastReader();
        int t = scan.nextInt();
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("A");
        obj.add("D");
        obj.add("O");
        obj.add("P");
        obj.add("Q");
        obj.add("R");
        while(t-->0){
            String s = scan.next();
            int count =0;
            for(int i=0;i<s.length();i++){
                String str = ""+s.charAt(i);
                if(obj.contains(str)){
                    count++;
                }
                if(str.equals("B")){
                    count+=2;
                }
            }
            p.println(count);
        }
    }
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        private long[] la(long n){
        long[] a = new long[(int)n];
        for(int i = 0;i < n;i++)a[i] = nextLong();
            return a;
        }
        private void pla(long[] a){
            for(int i = 0;i <a.length;i++)
                p.print(a[i]+" ");
        }
        private void pia(int[] a){
            for(int i = 0;i <a.length;i++)
                p.print(a[i]+" ");
        }

        public FastReader(){
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next(){
            while (st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e){
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
            String str = "";
            try{
                str = br.readLine();
            }
            catch (IOException e){
                e.printStackTrace();
            }
            return str;
        }
    }
} 