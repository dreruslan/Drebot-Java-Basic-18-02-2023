
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int minNumber = 0;
        int maxNumber = 10;
        int maxTries = 3;

        Random random = new Random();
        int randomNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;

        System.out.println("Комп'ютер загадав число в діапазоні від " + minNumber + " до " + maxNumber + ".");
        System.out.println("Ви маєте " + maxTries + " спроби, щоб відгадати це число.");

        Scanner scanner = new Scanner(System.in);
        int tries = 0;

        while (tries < maxTries) {
            System.out.print("Введіть ваше число: ");
            int guess = scanner.nextInt();
            tries++;

            if (guess == randomNumber) {
                System.out.println("Вітаємо! Ви вгадали число з " + tries + " спроби.");
                return;
            } else if (guess < randomNumber) {
                System.out.println("Ваше число менше загаданого.");
            } else {
                System.out.println("Ваше число більше загаданого.");
            }
        }

        System.out.println("Ви не вгадали число. Комп'ютер загадав число " + randomNumber + ".");
    }
}
