import java.util.Scanner;

public class TenMaker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number 1:");
        int number1 = in.nextInt();

        Scanner in2 = new Scanner(System.in);
        System.out.print("Enter Number 2:");
        int number2 = in2.nextInt();

        //Assigning the value to variable
        boolean sumisTen = makes10(number1, number2);
        //output
        if (sumisTen)
            System.out.print("The Sum is Ten");
        else
            System.out.print("The Sum is not Ten");
    }

    public static boolean makes10(int num1, int num2) {
        //returns true if sum is 10
        return (num1 + num2) == 10;
    }
}
