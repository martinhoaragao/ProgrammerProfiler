import java.util.*;
class solve{
	public static void main(String[] args){
	HashMap<Character,Integer> map=new HashMap<>();
	map.put('A',1);
	map.put('B',2);
	map.put('D',1);
	map.put('O',1);
	map.put('P',1);
	map.put('Q',1);
	map.put('R',1);
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	for(int i=0;i<T;i++){
		String s = sc.next();
		int counter=0;
		for(int j=0;j<s.length();j++){
			if(map.containsKey(s.charAt(j)))
				counter+=map.get(s.charAt(j));
		}
		System.out.println(counter);
	}
		
	}
}
