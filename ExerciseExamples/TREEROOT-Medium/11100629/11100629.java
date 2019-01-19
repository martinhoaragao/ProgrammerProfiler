import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {
	private static int taskNo = 0;

	public static void main(String[] args) {

		BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		int N = 0;
			try {
				N = Integer.parseInt(reader.readLine()); //no. of tests
				for(int problemNo=1; problemNo<=N; problemNo++){
					int nodeCount = Integer.parseInt(reader.readLine());
					HashMap<Integer, Integer> tree = new HashMap<Integer, Integer>();
					for(int nodeIndex=1; nodeIndex<=nodeCount; nodeIndex++){
						String nodeString = null;
						try{
							nodeString = reader.readLine();
						}
						catch(Exception e){
							e.printStackTrace();
						}
						String[] node = nodeString.split(" ");
						tree.put(Integer.parseInt(node[0]), Integer.parseInt(node[1]));	
					}
					printRootNodeID(tree);
					tree=null;
				// 	if(problemNo==N){
				// 		reader.close();
				// 	}
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			}

	private static void printRootNodeID(HashMap<Integer, Integer> tree) {
		Integer IDSum = 0;
		Integer childIDSum = 0;
		for(Integer nodeID : tree.keySet()){
			IDSum = IDSum + nodeID;
			childIDSum = childIDSum + tree.get(nodeID);
		}
		
		Integer rootID = IDSum - childIDSum;
		System.out.println(rootID);
	}

		
	}
