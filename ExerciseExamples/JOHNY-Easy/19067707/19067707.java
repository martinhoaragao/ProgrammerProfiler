import java.util.Scanner;

class uncleJ 
{

	 
	public static void main(String[] args) 
	{
		 
		int testC;
		
		Scanner scn = new Scanner(System.in);
		
		// get the no of test cases
		testC = scn.nextInt();
		
		while (testC > 0)
		{
			int arrLength, currPos, noToSearch, temp;
			
			// get the array length
			arrLength = scn.nextInt();
			
			int[] arr = new int[arrLength];
			
			// get the array of integer
			for (int z = 0; z < arrLength; z++)
			{
				arr[z] = scn.nextInt();
			}
			
			// get the current position of song
			currPos = scn.nextInt() - 1;
			
			noToSearch = arr[currPos];
			
			// bubble sorting algo 
			for(int i=0; i < arrLength; i++)
			{  
                for(int j=1; j < (arrLength-i); j++)
                {  
                         if(arr[j-1] > arr[j])
                         {  
                                //swap elements  
                                temp = arr[j-1];  
                                arr[j-1] = arr[j];  
                                arr[j] = temp;  
                        }  
                         
                }  
			}  
			
			//search the song
			for(int e = 0; e < arrLength; e++)
			{
				if(noToSearch == arr[e])
				{
					int xxx = e + 1;
					System.out.println(xxx);
					break;
				}
			}
			
			--testC;
		}
	}

}
