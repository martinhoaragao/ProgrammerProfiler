import java.util.Scanner;

class byteLandian{

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);

		int t = 0;
		while(t < 10){

			long coinNum = scan.nextLong();
			long amrDlrs = coinNum;

			amrDlrs = splitCoin(coinNum);
			System.out.println(amrDlrs);
			
			t++;

		}

	}

	public static long splitCoin(long num){

		if((num/2 + num/3 + num/4) > num){

			long byTwo = splitCoin(num/2);
			long byThree = splitCoin(num/3);
			long byFour = splitCoin(num/4);

			return byTwo+byThree+byFour;

		}

		return num;

	}

}