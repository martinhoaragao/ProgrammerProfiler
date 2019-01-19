/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;


import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Vinod
 */
 class TEmp {

    public static void main(String[] args) throws Exception {
       Reader r=new Reader(System.in);

        int t=r.nextInt();
        for (int i = 0; i < t; i++) {
            int n=r.nextInt();
            int sum=0;
            for (int j = 0; j < n; j++) {
                int a=r.nextInt();
                int b=r.nextInt();
                sum+=a-b;
            }
            System.out.println(""+sum);
        }
        }
    }

    class Reader {

        final private int BUFFER_SIZE = 1 << 17;
        public DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader(InputStream in) {
           din = new DataInputStream(in);
            buffer = new byte[BUFFER_SIZE];
           bufferPointer = bytesRead = 0;
        }

        public String nextString() throws Exception {
            StringBuffer sb = new StringBuffer("");
            byte c = read();
            while (c <= ' ') {
               c = read();
            }
            do {
                sb.append((char) c);
                c = read();
            } while (c > ' ');
            return sb.toString();
       }

        public char nextChar() throws Exception {
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            return (char) c;
        }

        public int nextInt() throws Exception {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
                c = read();
            } while (c > ' ');
            return ret;
        }

        public long nextLong() throws Exception {
            long ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
                c = read();
            } while (c > ' ');
            return ret;
        }

        public void skipNext() throws Exception {
            byte c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            do {
                c = read();
            } while (!isSpaceChar(c));
        }

        private static boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private void fillBuffer() throws Exception {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1) {
                buffer[0] = -1;
            }
        }

        private byte read() throws Exception {
            if (bufferPointer == bytesRead) {
                fillBuffer();
            }
            return buffer[bufferPointer++];
        }
    }
