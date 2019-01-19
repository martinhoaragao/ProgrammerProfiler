import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
 
class OutputWriter {
private final PrintWriter writer;
public OutputWriter(OutputStream outputStream) {
writer = new PrintWriter(outputStream);
}
public OutputWriter(Writer writer) {
this.writer = new PrintWriter(writer);
}
public void print(Object... objects) {
for (int i = 0; i < objects.length; i++) {
if (i != 0)
writer.print(' ');
writer.print(objects[i]);
}
}
 
public void printLine(Object... objects) {
print(objects);
writer.println();
}
public void close() {
writer.close();
}
}
 
class InputReader {
private InputStream stream;
private byte[] buf = new byte[1024];
private int curChar;
private int numChars;
public InputReader(InputStream stream) {
this.stream = stream;
}
public int read() {
if (numChars == -1)
throw new InputMismatchException();
if (curChar >= numChars) {
curChar = 0;
try {
numChars = stream.read(buf);
} catch (IOException e) {
throw new InputMismatchException();
}
if (numChars <= 0)
return -1;
}
return buf[curChar++];
}
public long nextLong() {
int c = read();
while (isSpaceChar(c))
c = read();
long sgn = 1;
if (c == '-') {
sgn = -1;
c = read();
}
long res = 0;
do {
if (c < '0' || c > '9')
throw new InputMismatchException();
res *= 10;
res += c - '0';
c = read();
} while (!isSpaceChar(c));
return res * sgn;
}
public int nextInt() {
int c = read();
while (isSpaceChar(c))
c = read();
int sgn = 1;
if (c == '-') {
sgn = -1;
c = read();
}
int res = 0;
do {
if (c < '0' || c > '9')
throw new InputMismatchException();
res *= 10;
res += c - '0';
c = read();
} while (!isSpaceChar(c));
return res * sgn;
}
public String nextString() {
int c = read();
while (isSpaceChar(c))
c = read();
StringBuffer res = new StringBuffer();
do {
res.appendCodePoint(c);
c = read();
} while (!isSpaceChar(c));
return res.toString();
}
static boolean isSpaceChar(int c) {
return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
}
public String next() {
return nextString();
}
}

class rootTree {
	public static void main(String args[])
	{
		
		InputReader sc = new InputReader(System.in);
		OutputWriter out1=new OutputWriter(System.out);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int s1=0,s2=0;
			while(n-->0)
			{
				s1=sc.nextInt()+s1;
				s2=s2+sc.nextInt();
			}
			out1.printLine(s1-s2);
		}
		out1.close();
	}
}