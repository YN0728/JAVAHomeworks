package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/////////////// HW 2 ////////////////
		//

		// 4.1
		Scanner scanner = new Scanner(System.in);
		//		int[] array = createArrayWithRandoms(10);
		//		printArray(array);
		//		int enteredNumber = scanner.nextInt();
		//		ifArrayContainsGivenNumber(enteredNumber, array);

		// 4.2
		//		int[] array = createArrayWithRandoms(10);
		//		printArray(array);
		//		printArray(sortAscendingOrder(array));

		// 4.3
		//		int[] array = createArrayWithRandoms(10);
		//		printArray(array);
		//		printArray(sortDescendingOrder(array));

		// 4.4
		//		int[] array = createArrayWithRandoms(10);
		//		printArray(array);
		//		int enteredNumber = scanner.nextInt();
		//		System.out.println(indexOfNumberInArray(enteredNumber, array)==-1?"Number does not exist":"Index is "+indexOfNumberInArray(enteredNumber, array));;

		// 4.5
		//		int[][] matrix = createMatrixWithRandoms(10,15);
		//		printMatrix(matrix);
		//		printMaxOfMatrix(matrix);

		// 4.6
		//		int[][] matrix = createMatrixWithRandoms(10,15);
		//		printMatrix(matrix);
		//		int inputNumber = scanner.nextInt();
		//		sumOfElementsGivenRow(inputNumber,matrix);

		// 4.7
		//		int[][] matrix = createMatrixWithRandoms(10,15);
		//		printMatrix(matrix);
		//		printMatrix(rotate90Degrees(matrix));

		// 4.8
		//		int[][] matrix = createMatrixWithRandoms(10,15);
		//		printMatrix(matrix);
		//		printMatrix(rotate180Degrees(matrix));

		// 4.9
		//		int[][] matrix = createMatrixWithRandoms(10,15);
		//		printMatrix(matrix);
		//		printMatrix(rotate270Degrees(matrix));

		// 4.10
		int[][] matrix = createMatrixWithRandoms(5,5);
		printMatrix(matrix);
		displayMenuUI(matrix);


	}

	public static void ifArrayContainsGivenNumber(int number, int[] array) {
		boolean flag = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				flag = true;
				break;
			}
		}
		System.out.println(flag ? "Array contains given number" : "Array does not contain given number");
	}

	public static int[] createArrayWithRandoms(int length) {
		Random random = new Random();
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = random.nextInt(99 - 10) + 10;
		}
		return array;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static int[] sortAscendingOrder(int[] array) {
		Arrays.sort(array);
		return array;
	}

	public static int[] sortDescendingOrder(int[] array) {
		sortAscendingOrder(array);
		for (int i = 0; i < array.length / 2; i++) {
			int temporary = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temporary;
		}
		return array;
	}

	public static int indexOfNumberInArray(int number, int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) return i;
		}
		return -1;

	}

	public static int[][] createMatrixWithRandoms(int rows, int columns) {
		Random random = new Random();
		int[][] matrix = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			matrix[i] = createArrayWithRandoms(columns);
		}
		return matrix;
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			printArray(matrix[i]);
		}
	}

	public static void printMaxOfMatrix(int[][] matrix) {
		int maximum = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			sortDescendingOrder(matrix[i]);
			if (maximum < matrix[i][0]) maximum = matrix[i][0];
		}
		System.out.println("Maximum of matrix is " + maximum);
	}

	public static void sumOfElementsGivenRow(int rowNumber, int[][] matrix) {
		int sum = 0;
		if (matrix.length <= rowNumber) {
			System.out.println("This row does not exist in matrix");
			return;
		}
		for (int i = 0; i < matrix[rowNumber].length; i++) {
			sum += matrix[rowNumber][i];
		}
		System.out.println(sum);
	}

	public static int[][] rotate90Degrees(int[][] matrix) {
		int[][] rotatedMatrix = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				rotatedMatrix[j][matrix.length - i - 1] = matrix[i][j];
			}
		}
		return rotatedMatrix;
	}

	// or just call rotate90Degrees 2 times
	public static int[][] rotate180Degrees(int[][] matrix) {
		int[][] rotatedMatrix = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				rotatedMatrix[matrix.length - 1 - i][matrix[0].length - j - 1] = matrix[i][j];
			}
		}
		return rotatedMatrix;
	}

	// or just call rotate90Degrees 3 times
	public static int[][] rotate270Degrees(int[][] matrix) {
		int[][] rotatedMatrix = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				rotatedMatrix[matrix[0].length - j - 1][i] = matrix[i][j];
			}
		}
		return rotatedMatrix;
	}

	public static void displayMenuUI(int[][] matrix) {
		Scanner inputNumber = new Scanner(System.in);
		System.out.println("------------ MENU -----------\n1. For rotating 90*\n2. For rotating 180*\n3. For rotating 270*\n4. For Exit\n");
		switch (inputNumber.nextInt()) {
			case 1:
				printMatrix(rotate90Degrees(matrix));
				displayMenuUI(matrix);
				break;
			case 2:
				printMatrix(rotate180Degrees(matrix));
				displayMenuUI(matrix);
				break;
			case 3:
				printMatrix(rotate270Degrees(matrix));
				displayMenuUI(matrix);
				break;
			case 4:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Insert 1 2 3 or 4");
				displayMenuUI(matrix);
		}
	}

}
