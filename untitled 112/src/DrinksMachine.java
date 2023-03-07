
import java.util.Scanner;

public class DrinksMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Drinks Machine!");
        System.out.println("Please choose a drink: COFFEE, TEA, LEMONADE, MOJITO, MINERAL, COCA_COLA");
        String choice = scanner.nextLine().toUpperCase();
        try {
            Drinks drink = Drinks.valueOf(choice);
            System.out.println("You have chosen " + drink);
            // Call method to make the drink here
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid choice: " + choice);
        }
    }
}

enum Drinks {
    COFFEE(2.50), TEA(2.00), LEMONADE(3.00), MOJITO(4.50), MINERAL(1.50), COCA_COLA(2.50);

    private final double price;

    Drinks(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private final Drinks drink;
    private final int quantity;

    public Order(Drinks drink, int quantity) {
        this.drink = drink;
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return drink.getPrice() * quantity;
    }

    public void prepare() {
        // Call appropriate method to prepare the drink based on the enum constant
    }
}
