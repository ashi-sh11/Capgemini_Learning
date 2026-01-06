package Task_06_01_26.Level1;

import java.util.Scanner;

public class Copy2DTo1DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int columns = input.nextInt();
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        int[] array = new int[rows * columns];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j];
            }
        }
        System.out.println("1D Array Elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
