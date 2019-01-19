import java.util.*;
import java.io.*;
//import javafx.util.*;
class j {
	static class Reader
    {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
 
        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }
 
        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');
 
            if (neg)
                return -ret;
            return ret;
        }
 
        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }
 
        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
 
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
 
            if (c == '.')
            {
                while ((c = read()) >= '0' && c <= '9')
                {
                    ret += (c - '0') / (div *= 10);
                }
            }
 
            if (neg)
                return -ret;
            return ret;
        }
 
        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }
 
        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }
 
        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }
    static int[][] a = new int[6][100002];
    static void p() {
    	int[] prime = new int[100002];
    	for(int i=2;i<100002;i++) {
    		if(prime[i]==0) {
    			for(int j=i;j<100002;j+=i) {
    				prime[j]++;
    			}
    		}
    	}
    	for(int i=1;i<6;i++) {
    		for(int j=2;j<100002;j++) {
    			a[i][j] = a[i][j-1];
    			if(prime[j]==i) {
    				a[i][j]++;
    			}
    		}
    	}
    }
    static boolean isSub(int[] a, int n, int m) {
    	if(m==0) return true;
    	if(n==0 && m!=0) return false;
    	if(a[n-1]>m) {
    		return isSub(a,n-1,m);
    	}
    	return isSub(a,n-1,m) || isSub(a,n-1,m-a[n-1]);
    }
	public static void main(String[] args) throws Exception{
		//Reader r = new Reader();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tst = Integer.parseInt(br.readLine());
		//p();
		//Q,R,S,T,U,V,W,X,Y,Z
		int[] a = {1,2,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0};
		while(tst-->0) {
			//int n = Integer.parseInt(br.readLine());
			String str = br.readLine();
			int count = 0;
			for(int i=0;i<str.length();i++) {
				count+=a[str.charAt(i)-'A'];
			}
			System.out.println(count);
		}
 	}
}