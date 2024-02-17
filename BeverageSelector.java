import java.util.Scanner;

public class BeverageSelector {
    public static void main(String[] args) {
        //Beverage Selection
        Scanner in = new Scanner(System.in);
        System.out.println("Choose a beverage: ");
        System.out.println("1. Water");
        System.out.println("2. Coke");
        System.out.println("3. Coffee");
        int choice = in.nextInt();
        //Output for selected beverage
        System.out.println("You have selected: " + BeverageSelectormethod(choice));
    }

    public static String BeverageSelectormethod(int choice) {
        //switch method for value return
        return switch (choice) {
            case 1 -> "Water";
            case 2 -> "Coke";
            case 3 -> "Coffee";
            default -> "Invalid Choice";
        };
    }
}
