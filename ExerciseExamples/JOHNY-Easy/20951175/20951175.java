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
            int num=indexArray[indexOfFavSong];
            int count=0;

            for (int j = 0; j < numberOfSongs; j++) {
                if(num<indexArray[j])
                    count++;
            }

            System.out.println(numberOfSongs-count);


//            int temp;
//            temp=indexArray[indexOfFavSong];
//            indexArray[indexOfFavSong]=indexArray[numberOfSongs-1];
//            indexArray[numberOfSongs-1]=temp;
//
//            int part=partition(indexArray,0,numberOfSongs-1);
//
//            System.out.println(part+1);


        }
    }
    }
