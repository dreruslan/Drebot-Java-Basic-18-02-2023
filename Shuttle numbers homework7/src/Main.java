
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> luckyNumbers = new ArrayList<Integer>();

        for (int i = 1; i <= 100; i++) {
            if (!String.valueOf(i).contains("4") && !String.valueOf(i).contains("9")) {
                luckyNumbers.add(i);
            }
        }

        System.out.println(luckyNumbers);
    }
}