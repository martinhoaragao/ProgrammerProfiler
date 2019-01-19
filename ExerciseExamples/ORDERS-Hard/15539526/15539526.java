 import java.util.*;
    import java.io.*;
    public class Main
    {  
        static int BIT[];
        static int n;
        public static void main(String[] args) throws IOException{
            Reader scan = new Reader();
            PrintWriter out = new PrintWriter(System.out,true);
            StringBuilder sb = new StringBuilder();
            int t = scan.nextInt();
            while(t-->0)
            {
            n = scan.nextInt();
            BIT = new int[n+1];
            int arr[]=new int[n];
            for(int i=0;i<n;++i)
            {
                arr[i] = scan.nextInt();
                update(i+1,1);
            }
            int perm[] = new int[n];
            for(int i=n-1;i>=0;--i)
            {  
               // System.out.println("total : "+query(n));
                int lidx = bs(query(n)-arr[i]);
                update(lidx,-1);
                perm[i] = lidx;
            }
            for(int i=0;i<n;++i)
                sb.append(perm[i]+" ");
            sb.append("\n");
            }
            out.println(sb);
            out.flush();
            out.close();
        }
        static int bs(int key)
        {  
            //System.out.println("key : "+key);
            int low = 1;
            int high = n;
            while(low<high)
            {
                int mid = (low+high)>>1;
                if(query(mid)==key)
                {
                    if(mid==1 || query(mid-1)<key)
                        return mid;
                    else high = mid-1;
                }
                else if(query(mid)<key)
                    low = mid+1;
                else high = mid-1;
            }
            return low;
        }
        static void update(int index,int val)
        {
            for(int i=index;i<=n;i+=i&-i)
                BIT[i]+=val;
        }
        static int query(int index)
        {
            int sum = 0;
            for(int i=index;i>0;i-=i&-i)
                sum+=BIT[i];
            return sum;
        }
        static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
     
        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
     
        public Reader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
     
        public String readLine() throws IOException {
            byte[] buf = new byte[64];
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }
     
        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ') c = read();
            boolean neg = (c == '-');
            if (neg) c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg) return -ret;
            return ret;
        }
     
        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ') c = read();
            boolean neg = (c == '-');
            if (neg) c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg) return -ret;
            return ret;
        }
     
        public double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ') c = read();
            boolean neg = (c == '-');
            if (neg) c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (c == '.') while ((c = read()) >= '0' && c <= '9') ret += (c - '0') / (div *= 10);
            if (neg) return -ret;
            return ret;
        }
     
        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1) buffer[0] = -1;
        }
     
        private byte read() throws IOException {
            if (bufferPointer == bytesRead) fillBuffer();
            return buffer[bufferPointer++];
        }
     
        public void close() throws IOException {
            if (din == null) return;
            din.close();
        }
    }
    }  