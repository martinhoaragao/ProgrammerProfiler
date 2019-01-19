import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef{
 public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  int testCases = sc.nextInt();
  while(testCases-->0){
   int position=0;
   int totalSongs = sc.nextInt();
   int[] songs = new int[totalSongs];
 
   for(int i=0;i<totalSongs;i++){
    songs[i]=sc.nextInt();
   }
   int johny = sc.nextInt()-1;
   for(int i=0;i<totalSongs;i++){
    if(songs[i]<songs[johny]){
      position++;
    }
   }
   System.out.println(position+1); 


  }
 }
}