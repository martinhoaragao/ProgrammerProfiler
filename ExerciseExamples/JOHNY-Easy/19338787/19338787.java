import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while(tc-- > 0) {
      int len = Integer.parseInt(br.readLine());
      int[] playList = new int[len];
      String[] line = br.readLine().split(" ");
      for(int i=0;i<line.length;i++) {
        playList[i] = Integer.parseInt(line[i]);
      }
      int johnyLength = playList[Integer.parseInt(br.readLine()) - 1];
      System.out.println(getNewIndexOfUncleJohny(playList, johnyLength));
    }
  }
  
  private static int getNewIndexOfUncleJohny(int[] playList, int johnyLength) {
    int newIndex = 0;
    for(int i=0;i<playList.length;i++) {
      if(playList[i] <= johnyLength) newIndex++;
    }
    return newIndex;
  }

}
