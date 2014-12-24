
import java.util.Stack;

public class TSPNearestNeighbour
{
	private int numberOfNodes;
	private Stack<Integer> stack;

	public TSPNearestNeighbour(){
		stack = new Stack<Integer>();
	}

	public void tsp(double adjacencyMatrix[][]){
		numberOfNodes = adjacencyMatrix[1].length;
		int[] visited = new int[numberOfNodes];
		visited[0] = 1;
		stack.push(0);
		int element, dst = 0, i;
		double min = Integer.MAX_VALUE;
		boolean minFlag = false;
		while (!stack.isEmpty()){
			element = stack.peek();
			i = 0;
			min = Double.MAX_VALUE;
			while (i < numberOfNodes){
				if (adjacencyMatrix[element][i] > 1 && visited[i] == 0){
					if (min > adjacencyMatrix[element][i]){
						min = adjacencyMatrix[element][i];
						dst = i;
						minFlag = true;
					}
				}
				i++;
			}
			if (minFlag){
				visited[dst] = 1;
				stack.push(dst);
				System.out.print(dst + "\t");
				minFlag = false;
				continue;
			}
			stack.pop();
		}
	}

	public static void test(){
		Drive drive = new Drive();
		DistancesMatrix dm = drive.originDistanceMatrix();
		TSPNearestNeighbour tspNearestNeighbour = new TSPNearestNeighbour();

		tspNearestNeighbour.tsp(dm.distances);
		Utils.printMatrix(dm.distances);
	}
}