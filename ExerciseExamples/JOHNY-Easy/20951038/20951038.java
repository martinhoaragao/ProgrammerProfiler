import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numOfTestCases = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numOfTestCases ; i++) {
            int numberOfSongs=scanner.nextInt();
            scanner.nextLine();
            String[] indexes=scanner.nextLine().split(" ");
            int[] indexArray=new int[numberOfSongs];
            for (int j = 0; j < numberOfSongs; j++) {
                indexArray[j]=Integer.parseInt(indexes[j]);
            }

            int indexOfFavSong=scanner.nextInt()-1;

            int temp;
            temp=indexArray[indexOfFavSong];
            indexArray[indexOfFavSong]=indexArray[numberOfSongs-1];
            indexArray[numberOfSongs-1]=temp;

            int part=partition(indexArray,0,numberOfSongs-1);

            System.out.println(part+1);


        }
    }

    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}