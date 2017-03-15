import java.util.*;
import java.io.*;

public class MultOutput {

	public static int[][] getInput(String filename) {
		int[][] arr = null;
		try {
			Scanner sc = new Scanner(new FileReader(filename));
			int row = sc.nextInt();
			int column = sc.nextInt();
			arr = new int[row][column];
			for (int i = 0; i < row; i++)
				for (int j = 0; j < column; j++)
					arr[i][j] = sc.nextInt();
			sc.close();
		} catch (NoSuchElementException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

		return arr;
	}

	public static void multOutput(int[][] firstArr, int[][] secondArr) {
		String filename = "Result3.txt";
		int[][] result = multiply(firstArr, secondArr);
		
		try {
			FileWriter output = new FileWriter(filename);
			String ostr = "";
			
			System.out.println(ostr = (result.length + "\t" + result[0].length));
			output.write(ostr);
			
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result[0].length; j++) {
					System.out.print(ostr = (result[i][j] + "\t"));
					output.write(ostr);
				}
				System.out.println();
				output.write("\r\n"); // Carriage return
			}
			output.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	public static int[][] multiply(int[][] m1, int[][] m2) {
		int m1rows = m1.length;
		int m1cols = m1[0].length;
		int m2rows = m2.length;
		int m2cols = m2[0].length;
		int[][] result = new int[m1rows][m2cols];
		for (int i = 0; i < m1rows; i++)
			for (int j = 0; j < m2cols; j++)
				for (int k = 0; k < m1cols; k++)
					result[i][j] += m1[i][k] * m2[k][j];
		return result;
	}

	public static void main(String[] args) {
		// Create 2D array pointers
		int[][] firstMatrix = null, secondMatrix = null;

		Scanner input = new Scanner(System.in);

		// Get the First Matrix
		System.out.print("Enter the First file name: ");
		String filename = input.next();
		firstMatrix = getInput(filename);

		// Get the Second Matrix
		System.out.print("Enter the Second file name: ");
		filename = input.next();
		secondMatrix = getInput(filename);

		// Multiply and Output it to a file
		System.out.println("MATRIX MULTIPLY:");
		if (firstMatrix != null && secondMatrix != null)
			multOutput(firstMatrix, secondMatrix);
	}
}
