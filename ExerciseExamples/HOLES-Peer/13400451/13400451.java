import java.util.*;
import java.io.*;
import java.util.regex.*;

class HT
{
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

static int[] iaread(int n) throws IOException
{
int[] a = new int[n];
int i=0;

StringTokenizer st = new StringTokenizer(br.readLine());
while(st.hasMoreTokens()){
a[i++]=ip(st.nextToken());
}
return a;
}

static int ip(String x)
{
return Integer.parseInt(x);
}

static int iread() throws IOException
{
return Integer.parseInt(br.readLine());
}

static String sread()  throws IOException
{
return br.readLine();
}

public static void main(String[] args) throws IOException
{
int test = iread();
int count=0;

while(test-- > 0){
String str = sread();
count=0;

Pattern p = Pattern.compile("[QROPAD]");
Matcher m = p.matcher(str);

while(m.find())count++;


Pattern p1 = Pattern.compile("[B]");
Matcher m1 = p1.matcher(str);

while(m1.find())count+=2;

System.out.println(count);
}

}

}