import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
 
/** Class for buffered reading int and double values */
class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;
 
    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }
 
    /** get next word */
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                   reader.readLine() );
        }
        return tokenizer.nextToken();
    }
 
    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
	
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
    
    static long nextLong() throws IOException {
        return Long.parseLong( next() );
    }
}
public class Main {

	public static void main(String[] args)throws IOException {
		Reader.init(System.in);
		int Tcase=Reader.nextInt();
		for(int i=0;i<Tcase;i++) {
			String str = Reader.next();
			int count=0;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)=='A' || str.charAt(j)=='D' || str.charAt(j)=='O' || str.charAt(j)=='P' || str.charAt(j)=='Q' || str.charAt(j)=='R') {
					count++;
				}
				else if(str.charAt(j)=='B') {
					count+=2;
				}
			}
			System.out.println(count);
		}
}
}
/*
 *	Q3 fianl 2 from N
 * #include<bits/stdc++.h>
 
#define int long long
#define pii pair<int,int>
#define X first
#define Y second
 
const int mod=(int)1e9+7;
const int inf=(int)1e18;
 
using namespace std;
 
 
signed main()
{
	ios_base::sync_with_stdio(false);cin.tie(0);cout.tie(0);
	
	//freopen("input.txt","r",stdin);
	//freopen("output.txt","w",stdout);
	
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		if(n==2)
		{
			cout<<1<<" "<<2<<"\n";
			continue;
		}
		int first=2*n+1;
		int temp=pow(2,((int)log2(n))+1);
		first-=temp;
		int second=2*n+1;
		int x=n-1;
		temp=3*(pow(2,(int)ceil(log2(ceil(n/3.0)))));
		second=second-temp;
		cout<<first<<" "<<second<<"\n";
	}
 
	return 0;
} 
 */