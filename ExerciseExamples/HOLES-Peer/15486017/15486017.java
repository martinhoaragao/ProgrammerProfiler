import java.util.*;

class holes{
	public static void main(String[] ar){
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();
		h.put('A',1);
		h.put('B',2);
		h.put('D',1);
		h.put('O',1);
		h.put('P',1);
		h.put('Q',1);
		h.put('R',1);

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int count=0;
		for(int i=0;i<t;i++){
		String s=sc.next();
		for(int j=0;j<s.length();j++)
		{
			if(h.containsKey(s.charAt(j)))
				count=count+(int)h.get(s.charAt(j));
		}
		System.out.println(count);
		count=0;
		}
	}
}