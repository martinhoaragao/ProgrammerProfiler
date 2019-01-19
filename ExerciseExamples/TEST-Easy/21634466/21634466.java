import java.util.Scanner;
import java.util.ArrayList;
class TEST{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		ArrayList<Short>arr = new ArrayList<Short>();
		int i=-1;
		do{
			arr.add(s.nextShort());
			i++;
		}while(arr.get(i)!=42);
		for(int j=0;j<arr.size()-1;j++){
		    System.out.println(arr.get(j));
		 }
	}
}