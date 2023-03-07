import java.util.Scanner;

class User {
    private String login;
    private String password;

    public User(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        // Перевірка логіну
        if (login.length() > 20 || !login.matches("[a-zA-Z]+")) {
            throw new WrongLoginException();
        }

        // Перевірка паролю
        if (password.length() < 6 || password.length() > 25 || !password.matches("^(?=.*[a-zA-Z])(?=.*\\d)[a-zA-Z\\d]+$") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }

        this.login = login;
        this.password = password;
    }

    // Геттери
    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}

class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Неправильний логін");
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Неправильний пароль");
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (true) {
            System.out.print("Введіть логін: ");
            String login = scanner.nextLine();
            System.out.print("Введіть пароль: ");
            String password = scanner.nextLine();
            System.out.print("Підтвердіть пароль: ");
            String confirmPassword = scanner.nextLine();

            try {
                User user = new User(login, password, confirmPassword);
                System.out.println("Користувач успішно створений з логіном " + user.getLogin() + " та паролем " + user.getPassword());
                break;
            } catch (WrongLoginException | WrongPasswordException e) {
                System.out.println("Помилка: " + e.getMessage());
                attempts++;

                if (attempts >= 3) {
                    System.out.println("Ви вичерпали всі спроби!");
                    break;
                }
            } finally {
                System.out.println("Дякуємо, що скористалися нашим сервісом!");
            }
        }
    }
}
