
import java.util.*;
class ROUGH {

	public static void main(String[] args) {
		
          Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         while(t-->0) {
///////////////////////////////////////////////////////////////////////////////////////
  int n=sc.nextInt();
  List<Integer> list=new ArrayList<>();
  list.add(0);
  for(int i=1;i<=n;++i)
	  list.add(sc.nextInt());
  int x=list.get(sc.nextInt());
  Collections.sort(list);
        int index=Collections.binarySearch(list,x);
         System.out.println(index);
         }
//////////////////////////////////////////////////////////////////////////////////////        	  
         
	}
	
	}
	


