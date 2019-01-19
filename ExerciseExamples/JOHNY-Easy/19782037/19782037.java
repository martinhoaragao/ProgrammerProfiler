/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer testCases = Integer.parseInt(br.readLine());
        for(int tc = 0; tc < testCases; ++tc) {
            Integer songsCount = Integer.parseInt(br.readLine());
            String [] songsStrings = br.readLine().split("\\s");
            
            List<Integer> songs = Stream.of(songsStrings)
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            
            Integer favoritePosition = Integer.parseInt(br.readLine());
            Integer favoriteValue = songs.get(favoritePosition - 1);
            
            Collections.sort(songs);
            // binary search for favorite song;
            // System.out.println(songs.indexOf(favoriteValue) + 1);
            int from = 0;
            int to = songs.size() - 1;
            int mid = (to + from) / 2;
            int position = -1;
            while (from <= to) {
                int currentValue = songs.get(mid);
                if (currentValue == favoriteValue) {
                    position = mid;
                    break;
                }
                if (currentValue > favoriteValue) {
                    to = mid - 1;
                } else {
                    from = mid + 1;
                }
                mid = (to + from) / 2;
            }
            
            if (position == -1) {
                System.out.println("Unexpected error - we did not find the value " + favoriteValue + "\nin the list:" + songs);
            } else {
                System.out.println(position + 1);
            }
        }
    }

}