import java.util.Scanner;

public class Summer {
    public static void main(String[] args) {
        //method to calculate sum
        calculateSum();
    }

    private static void calculateSum() {
        //Scanner for input for numbers
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int number;
        while (true) {
            System.out.print("Enter the number:");
            number = in.nextInt();
            sum = sum + number;
            //if the value that user enter is 0
            // the while loop breaks and it won't ask for any more numbers to the user
            if (number == 0)
                break;
        }
        //Output the sum of numbers
        System.out.println("Sum of the numbers is:" + sum);
    }
}
