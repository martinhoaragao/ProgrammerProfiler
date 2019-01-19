import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
  public static void main(String args[] ) throws Exception {
  
 
	map.put(0l,0l);
	map.put(1l,1l);
	
String content = new Scanner(System.in).useDelimiter("\\Z").next();
	String lines[] = content.split("\\n");
	
	for(int i = 0; i< lines.length; i++) {
		int t = Integer.parseInt(lines[i]);
	     long val = getval2(t);
	 	System.out.println(val);
	}

}

static Map<Long, Long> map = new HashMap<Long, Long>();
private static long getval2(long t) {
	if(map.containsKey(t)) {
		return map.get(t);
	}
	long cost = Math.max(t, getval2(t/2) +  getval2(t/3) +  getval2(t/4));
	map.put(t, cost);
	return cost;
}
}