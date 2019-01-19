import java.util.HashMap;
import java.util.Scanner;

class Holes_in_the_text 
{
	public static void main(String[] Sym) 
	{
		HashMap<Character, Integer> Hshmap = new HashMap<Character, Integer>();
		Hshmap.put('Q', 1);
		Hshmap.put('P', 1);
		Hshmap.put('R', 1);
		Hshmap.put('O', 1);
		Hshmap.put('A', 1);
		Hshmap.put('D', 1);
		Hshmap.put('B', 2);
		
		Scanner sym  = new Scanner(System.in);
		int times = sym.nextInt();
		for (int i = 0; i < times; i++) 
		{
			int count = 0 ; 
			String Str = sym.next();
			for (int j = 0; j < Str.length(); j++) {
				try {
					count += Hshmap.get(Str.charAt(j));
				}catch(Exception e) {}
			}
			System.out.println(count);
		}
		sym.close();
	}
}