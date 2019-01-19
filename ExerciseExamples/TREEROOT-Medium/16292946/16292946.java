import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Set;
import java.util.TreeSet;

 class RootProblem {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pr = new PrintWriter(new BufferedOutputStream(System.out));
		int noOfTestCase = Integer.parseInt(br.readLine());
		for(int testCase = 0; testCase < noOfTestCase; testCase++) {
			int noOfInput = Integer.parseInt(br.readLine());
			//int[] data = new int[noOfInput];
			//int[] root = new int[noOfInput];
			//boolean[] visited = new boolean[noOfInput];
			long rootVal = 0;
			for(int i = 0; i < noOfInput; i++) {
				String[] rootData = br.readLine().split(" ");
				rootVal += Long.parseLong(rootData[0]) - Long.parseLong(rootData[1]);
				//root[i] = Integer.parseInt(rootData[0]);
				//data[i] = Integer.parseInt(rootData[1]);
			}
			/*Set<Integer> rootSet = new TreeSet<>();
			getRoot(0, noOfInput, data, root, 0, visited, rootSet, 0, -1);
			for(int rootData : rootSet) {
				pr.println(rootData);
			}*/
			pr.println(rootVal);
			 
		}
		pr.close();
	}
	
	public static void getRoot(int level, int size, int[] data, int[] root, int val, boolean[] visited, Set<Integer> path, int visitedCount, int rootVal) {
		
		if(level == size) {
			System.out.println(path);
			if(visitedCount == data.length && rootVal != -1) {
				path.add(rootVal);
			}
			return;
		}
		for(int index = 0; index < data.length; index++) {
			if(!visited[index] && data[index] == val) {
				visited[index] = true;
				getRoot(level + 1, size, data, root, root[index], visited, path, visitedCount + 1, root[index]);
				visited[index] = false;
			}
			if(level != index && !visited[level] && !visited[index] && (data[level] + data[index]) == val) {
				visited[level] = true;
				visited[index] = true;
				getRoot(level + 1, size, data, root, root[level] + root[index], visited, path, visitedCount + 2, -1);
				visited[level] = false;
				visited[index] = false;
			}
		}
		getRoot(level + 1, size, data, root, val, visited, path, visitedCount, -1);
	}
}
