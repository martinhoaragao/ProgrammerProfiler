import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Hashtable;


class HoleInTheNext {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x = Integer.parseInt(in.readLine());
		Hashtable<Character, Integer> hs = new Hashtable<Character,Integer>(26);
		hs.put('A',1);
		hs.put('B',2);
		hs.put('D',1);
		hs.put('O',1);
		hs.put('P',1);
		hs.put('Q',1);
		hs.put('R',1);
		for(int i = 0;i<x;i++){
			out.write(c(in.readLine(),hs) + "\n");
		}
		out.flush();
	}
	
	public static int c(String t, Hashtable<Character, Integer> hs){
		char[] p = t.toCharArray();
		int u = 0;
		for(int j = 0;j<p.length;j++){
			if(hs.containsKey(p[j])){
				u+=hs.get(p[j]);
			}
		}
		return u;
	}
}
