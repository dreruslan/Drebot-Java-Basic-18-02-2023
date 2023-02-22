
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Введення даних про першу команду
        System.out.print("Введіть ім'я першої команди: ");
        String team1Name = input.nextLine();

        int[] team1Scores = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Введіть кількість фрагів для гравця " + (i+1) + " команди " + team1Name + ": ");
            team1Scores[i] = input.nextInt();
        }

        // Введення даних про другу команду
        System.out.print("Введіть ім'я другої команди: ");
        input.nextLine();
        String team2Name = input.nextLine();

        int[] team2Scores = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Введіть кількість фрагів для гравця " + (i+1) + " команди " + team2Name + ": ");
            team2Scores[i] = input.nextInt();
        }

        // Підрахунок середнього арифметичного балу кожної команди
        double team1AvgScore = calculateAverage(team1Scores);
        double team2AvgScore = calculateAverage(team2Scores);

        // Визначення переможця
        String winningTeam;
        int winningScore;
        if (team1AvgScore > team2AvgScore) {
            winningTeam = team1Name;
            winningScore = (int) Math.round(team1AvgScore);
        } else if (team2AvgScore > team1AvgScore) {
            winningTeam = team2Name;
            winningScore = (int) Math.round(team2AvgScore);
        } else {
            System.out.println("Нічия!");
            return;
        }

        // Виведення результатів
        System.out.println("Перемогла команда " + winningTeam + " набрала " + winningScore + " очків");
    }

    // Функція для підрахунку середнього арифметичного
    public static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return (double) sum / scores.length;
    }
}
