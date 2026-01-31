package Task_09_01_26_CapgeminiQuestionList;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        display(matrix);
        System.out.println();
        transpose(matrix);
        display(matrix);
    }

    static int[][] transpose(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j <matrix[0].length; j++) {
                if(i<j){
                    int temp = matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
        return matrix;
    }

    static void display(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
