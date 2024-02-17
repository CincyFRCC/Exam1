public class PrintNumber {
    public static void main(String[] args) {
        //Printing numbers method
        printNumbersStarttoEnd(5, 19);
    }

    private static void printNumbersStarttoEnd(int start, int end) {
        System.out.println("Numbers from " + start + " to " + end);
        //for loop to print the number from 5 to 19
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}
