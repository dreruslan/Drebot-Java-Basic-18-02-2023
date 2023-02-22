
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Приклад виклику методу для розрахунку середнього арифметичного масиву
        int[] array = {1, 2, 3, 4, 5};
        double average = calculateAverage(array);
        System.out.println("Середнє арифметичне масиву " + Arrays.toString(array) + " = " + average);

        // Приклад виклику методу для перевірки, чи є матриця квадратною
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        boolean isSquare = isSquareMatrix(matrix);
        System.out.println("Матриця " + Arrays.deepToString(matrix) + " є квадратною: " + isSquare);
    }

    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    public static boolean isSquareMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        return rows == columns;
    }
}