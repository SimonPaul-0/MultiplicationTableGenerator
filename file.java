import java.util.Scanner;

public class MultiplicationTableGenerator {
    public static void generateMultiplicationTable() {
        try {
            Scanner scanner = new Scanner(System.in);

            // Get the number for which the multiplication table will be generated
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Get the range for the multiplication table
            System.out.print("Enter the start of the range: ");
            int startRange = scanner.nextInt();
            System.out.print("Enter the end of the range: ");
            int endRange = scanner.nextInt();

            // Generate and display the multiplication table
            System.out.println("\nMultiplication Table for " + number + " in the range " + startRange + " to " + endRange + ":\n");
            for (int i = startRange; i <= endRange; i++) {
                int result = number * i;
                System.out.println(number + " * " + i + " = " + result);
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Multiplication Table Generator!");

        while (true) {
            generateMultiplicationTable();

            // Ask the user if they want to generate another multiplication table
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nGenerate another multiplication table? (yes/no): ");
            String anotherTable = scanner.next().toLowerCase();
            if (!anotherTable.equals("yes")) {
                System.out.println("Goodbye!");
                break;
            }
        }
    }
}
