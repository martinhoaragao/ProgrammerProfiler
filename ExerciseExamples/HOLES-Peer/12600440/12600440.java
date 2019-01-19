import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class Main {

	private static final Map<Character, Integer> MAP = Collections.unmodifiableMap(
		    new HashMap<Character, Integer>() {
				private static final long serialVersionUID = 4486604239167882738L;
			{
		        put('A', 1);
		        put('D', 1);
		        put('O', 1);
		        put('P', 1);
		        put('R', 1);
		        put('Q', 1);
		        put('B', 2);
		    }});
	
	public void run()
	{

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int t = Integer.parseInt(scan.readLine());
			
			for (int i = 0; i < t; i++)
			{
				String line = scan.readLine();
				calculateHoles(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void calculateHoles(String line)
	{
		int out = 0;
		for (int i = 0; i < line.length(); i++)
		{
			Integer tmpHoles = MAP.get(line.charAt(i));
			if (tmpHoles != null)
			{
				out += tmpHoles;
			}
		}
		System.out.println(out);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}
