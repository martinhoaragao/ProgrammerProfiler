import java.util.Scanner;

class Buteland {
	
	public long change(long x){
		long y;
		if(x<=11)
			return x;
		y = change(x/2)+change(x/3)+change(x/4);
		if(y>x)
			return y;
		return x;
	}

	public static void main(String[] args) {
		Buteland b = new Buteland();
		long num[] = new long[10];
		int i = 0;
		long res;
		Scanner s = new Scanner(System.in);
		for(int j=0;j<10;j++){
			String strnum = s.nextLine();
			if(strnum.equals(""))
				break;
			num[i] = Long.valueOf(strnum);
					res = b.change(num[i]/2)+b.change(num[i]/3)+b.change(num[i]/4);
			if(res>num[i])
				System.out.println(res);
			else
				System.out.println(num[i]);
			i++;
		}
		
		/*for(int a = 0; a < i ; a++){
			
			res = b.change(num[a]/2)+b.change(num[a]/3)+b.change(num[a]/4);
			if(res>num[a])
				System.out.println(res);
			else
				System.out.println(num[a]);
		}*/

	}

}
