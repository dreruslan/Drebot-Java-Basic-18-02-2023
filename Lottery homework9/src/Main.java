
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // ініціалізуємо два масиви з 7 цифр
        int[] lotteryNumbers = new int[7];
        int[] playerNumbers = new int[7];
        for (int i = 0; i < 7; i++) {
            lotteryNumbers[i] = (int) (Math.random() * 10);
            playerNumbers[i] = (int) (Math.random() * 10);
        }

        // відсортуємо масиви за зростанням
        Arrays.sort(lotteryNumbers);
        Arrays.sort(playerNumbers);

        // знайдемо кількість збігів
        int matches = 0;
        for (int i = 0; i < 7; i++) {
            if (lotteryNumbers[i] == playerNumbers[i]) {
                matches++;
            }
        }

        // виведемо масиви та кількість збігів у консоль
        System.out.println(Arrays.toString(lotteryNumbers));
        System.out.println(Arrays.toString(playerNumbers));
        System.out.println("Кількість збігів: " + matches);
    }
}
