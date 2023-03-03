import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		System.out.println("Please enter the rows in the matrix");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.println("Please enter the columns in the matrix");
		int column = sc.nextInt();

		int[][] first = new int[row][column];
		int[][] second = new int[row][column];

		for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {
				System.out.println(String.format("Enter first[%d][%d] integer", r, c));
				first[r][c] = sc.nextInt();
			}
		}

		for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {
				System.out.println(String.format("Enter second[%d][%d] integer", r, c));
				second[r][c] = sc.nextInt();
			}
		}

		// close the scanner
		sc.close();
System.out.println("First Matrix:\n");
		print2dArray(first);

		System.out.println("Second Matrix:\n");
		print2dArray(second);

		// sum of matrices
}
private static void print2dArray(int[][] matrix) {
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				System.out.print(matrix[r][c] + "\t");
			}
			System.out.println();
		}
	}
	

}