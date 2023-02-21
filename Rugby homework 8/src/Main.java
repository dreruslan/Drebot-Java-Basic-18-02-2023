
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int teamSize = 25; // розмір команди
        int[] team1 = new int[teamSize]; // створюємо масив для першої команди
        int[] team2 = new int[teamSize]; // створюємо масив для другої команди

        // генеруємо випадковий вік гравців для кожної команди
        Random random = new Random();
        for (int i = 0; i < teamSize; i++) {
            team1[i] = random.nextInt(23) + 18; // вік гравця в діапазоні від 18 до 40
            team2[i] = random.nextInt(23) + 18;
        }

        // виводимо вік гравців кожної команди
        System.out.println("Перша команда:");
        for (int age : team1) {
            System.out.print(age + " ");
        }
        System.out.println();
        System.out.println("Друга команда:");
        for (int age : team2) {
            System.out.print(age + " ");
        }
        System.out.println();

        // рахуємо середній вік гравців кожної команди
        double team1AverageAge = 0;
        double team2AverageAge = 0;
        for (int age : team1) {
            team1AverageAge += age;
        }
        team1AverageAge /= teamSize;
        for (int age : team2) {
            team2AverageAge += age;
        }
        team2AverageAge /= teamSize;

        // виводимо середній вік гравців кожної команди
        System.out.println("Середній вік першої команди: " + team1AverageAge);
        System.out.println("Середній вік другої команди: " + team2AverageAge);
    }
}
