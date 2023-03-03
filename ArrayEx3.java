import java.util.Scanner;
class ArrayEx3{
public static void main(String[] args)
{
Scanner input= new Scanner(System.in);
System.out.println("Enter the row value");
int a = input.nextInt();
int row = input.nextInt();
System.out.println("Enter the column value");
int column = input.nextInt();

int[][] first = new int[row][column];
int[][] second = new int[row][column];

for(int r=0;r<row;r++){
for(int c=0;c<column;c++){
System.out.println(String.format("Enter first value [%d][%d] integer" , r, c));
 first[r][c] =input.nextInt();
}
}
for(int r=0;r<row;r++){
for(int c=0;c<column;c++){
System.out.println(String.format("Enter first value [%d][%d] integer" , r, c));
 second[r][c] =input.nextInt();
}
}
input.close();
System.out.println("first matrix: \n");
print2dArray(first);
System.out.println("second matrix: \n");
print2dArray(second);
}
public static void print2dArray(int[][] matrix) {
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				System.out.print(matrix[r][c] + "\t");
			}
			System.out.println();
		}
	}
	
}








