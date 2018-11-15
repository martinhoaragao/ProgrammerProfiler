import java.util.Scanner;

class OrderingTheSoldiers{
	Scanner scan;
	public static void main(String[] args){
		OrderingTheSoldiers orderingTheSoldiers=new OrderingTheSoldiers();
		orderingTheSoldiers.scan=new Scanner(System.in);

		orderingTheSoldiers.ExecuteTestCases();
	}

	void ExecuteTestCases(){
		int numOfTestCases=GetInteger();
		while(numOfTestCases>0){
			int numberOfSoldiers=GetInteger();
			int[] commandsObserverdByGeneral=GetArray(numberOfSoldiers);

			PrintOutput(FindInitialPositionOfSoldiers(commandsObserverdByGeneral,numberOfSoldiers));
			numOfTestCases--;
		}
	}

	int[] FindInitialPositionOfSoldiers(int[] movements,int numberOfSoldiers){
		int[] soldiersArray=MakeSoldiersArray(numberOfSoldiers);
		int limit=movements.length;
		for(int i=limit-1;i>=0;i--){
			int initialIndex=i-movements[i];
			ChangeArray(soldiersArray,initialIndex,i);
		}
		
		return soldiersArray;
	}

	void ChangeArray(int[] arrayOfSolds,int initialIndex,int destIndex){
		while(initialIndex!=destIndex){
			SwapFunction(arrayOfSolds,initialIndex,initialIndex+1);
			initialIndex++;
		}
	}

	void SwapFunction(int[] arrayOfSolds,int index1,int index2){
		int helperVariable=arrayOfSolds[index1];
		arrayOfSolds[index1]=arrayOfSolds[index2];
		arrayOfSolds[index2]=helperVariable;
	}

	int GetInteger(){
		return scan.nextInt();
	}

	int[] GetArray(int sizeOfArray){
		int[] newArray=new int[sizeOfArray];
		for(int i=0;i<sizeOfArray;i++){
			newArray[i]=GetInteger();
		}

		return newArray;
	}

	int[] MakeSoldiersArray(int soldiers){
		int[] soldiersArray=new int[soldiers];
		int number=1;
		for(int i=0;i<soldiers;i++){
			soldiersArray[i]=number;
			number++;
		}

		return soldiersArray;
	}

	void PrintOutput(int[] arrayOfSoldiers){
		int numberOfSoldiers=arrayOfSoldiers.length;
		for(int i=0;i<numberOfSoldiers;i++){
			System.out.print(arrayOfSoldiers[i]+" ");
		}
		System.out.println();
	}



}
