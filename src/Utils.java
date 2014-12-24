
public class Utils {
	public static void printMatrix(double[][] matrix){
		System.out.println("\n\n");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
