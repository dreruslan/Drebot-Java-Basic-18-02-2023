
import java.time.LocalDate;

public class FitnessTracker {
    private String firstName;
    private String lastName;
    private int weight;
    private int bloodPressure;
    private int stepsPerDay;
    private String email;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private int age;

    public FitnessTracker(String firstName, String email, String phoneNumber, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getStepsPerDay() {
        return stepsPerDay;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void printAccountInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Blood Pressure: " + bloodPressure);
        System.out.println("Steps per Day: " + stepsPerDay);
        //При створенні облікового запису у конструкторі виконується розрахунок віку користувача
        // за допомогою методу getYear() з класу LocalDate.
        // Оновлене поле age зберігається в об'єкті, і його можна отримати
        // за допомогою геттера getAge(). Метод printAccountInfo() виводить всі поля користувача,
        // включаючи вік, в консоль.
    }
}
