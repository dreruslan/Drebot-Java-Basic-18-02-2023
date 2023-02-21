
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // отримуємо розміри матриці з консолі
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість рядків матриці: ");
        int rows = scanner.nextInt();
        System.out.print("Введіть кількість стовпців матриці: ");
        int columns = scanner.nextInt();

        // ініціалізуємо матрицю та транспонований масив
        int[][] matrix = new int[rows][columns];
        int[][] transposedMatrix = new int[columns][rows];

        // заповнюємо матрицю випадковими числами та виводимо її на екран
        System.out.println("Матриця:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // транспонуємо матрицю та виводимо її на екран
        System.out.println("Транспонована матриця:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                transposedMatrix[i][j] = matrix[j][i];
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}