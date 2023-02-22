
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Will", "Smith", "New York", "2936729462846");
        System.out.println(person1.personInfo());

        Person person2 = new Person("Jackie", "Chan", "Shanghai", "12312412412");
        System.out.println(person2.personInfo());

        Person person3 = new Person("Sherlock", "Holmes", "London", "37742123513");
        System.out.println(person3.personInfo());
    }
}

class Person {
    private String firstName;
    private String lastName;
    private String city;
    private String phone;

    public Person(String firstName, String lastName, String city, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.phone = phone;
    }

    public String personInfo() {
        return "Зателефонувати громадянинові " + firstName + " " + lastName + " з міста " + city + " можна за номером " + phone + ".";
    }
}
