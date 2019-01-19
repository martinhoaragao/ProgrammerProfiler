import java.util.*;
import java.util.Map.Entry;
class temp {
	static Scanner sc=new Scanner(System.in); 
	public static void TREEROOT(){
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			if(n==1){
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println(a);
			}
			else{
				HashMap<Integer,Integer> map=new HashMap<>();
				for(int i=0;i<n;i++){
				  map.put(sc.nextInt(),sc.nextInt());
				}
				int[] ver=new int[1001];
				int sumVer=0,sumChild=0;
				for(int i=1;i<1001;i++){
					if(map.containsKey(i)){
						sumVer+=i;
						sumChild+=map.get(i);
						ver[i]=map.get(i);
					}
					else{
						ver[i]=-1;
					}
				}
				for(int i=1;i<1001;i++){
					if(ver[i]!=-1 && sumChild==(sumVer-i)){
						System.out.println(i);
					}
				}
			}
		}
	}
        public static void main(String[] args) {
		TREEROOT();
	}

}
