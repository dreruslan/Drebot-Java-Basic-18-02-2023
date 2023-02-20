public class Main
    public static void main(String[] args) {
        // Звідси ми можемо створити об'єкти класу FitnessTracker та встановити їх поля за
            // допомогою конструктора. Після цього можемо викликати метод printAccountInfo()
            // для кожного об'єкта, щоб вивести інформацію про кожного користувача.
            //
            //Ось приклад коду, який створює три об'єкти FitnessTracker та викликає метод printAccountInfo() для кожного з них:
        // Створення об'єкту FitnessTracker для користувача 1
        FitnessTracker user1 = new FitnessTracker("John", "Doe", 1990, "johndoe@example.com", "123-456-7890", 70, 120, 5000);

        // Створення об'єкту FitnessTracker для користувача 2
        FitnessTracker user2 = new FitnessTracker("Jane", "Doe", 1985, "janedoe@example.com", "987-654-3210", 60, 110, 8000);

        // Створення об'єкту FitnessTracker для користувача 3
        FitnessTracker user3 = new FitnessTracker("Bob", "Smith", 1975, "bobsmith@example.com", "555-555-5555", 80, 130, 10000);

        // Виведення інформації про користувачів
        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();

        // Зміна кількох полів для користувача 1
        user1.setWeight(75);
        user1.setSteps(7000);

        // Зміна кількох полів для користувача 2
        user2.setWeight(65);
        user2.setPressure(115);

        // Виведення оновленої інформації про користувачів
        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
        //
    }
}
