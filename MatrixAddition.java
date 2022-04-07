 package week1.day2;

public class MatrixAddition {
	
	//Method(printing)CreatedToUsePrintRepeatedly
	public static void printing (int [][]matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] +" ");
			}
			System.out.println();
			}
		}
public static void main(String[] args) {
	int [][] matrix1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	int [][] matrix2 = {{12,11,10,9},{8,7,6,5},{4,3,2,1}};
	System.out.println("Matrix1");
	printing (matrix1);
	System.out.println("Matrix2");
	printing (matrix2);
	
	System.out.println("Result");
	int[][] result = new int [matrix1.length][matrix1[1].length];
	for (int i = 0; i < result.length; i++) {
		for (int j = 0; j < result[i].length; j++) {
			result[i][j]= matrix1[i][j]+matrix2[i][j];
			
			System.out.print(result[i][j]+ " ");
		}
		System.out.println();
	}
	
	
	
	
	
	
}
}
