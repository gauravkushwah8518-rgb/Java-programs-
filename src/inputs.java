import java.util.Scanner; // 1. Import the Scanner class

public class inputs {
    public static void main(String[] args) {
        // 2. Create a Scanner object to read from standard input (keyboard)
        Scanner scanner = new Scanner(System.in);

        // 3. Reading a String (Full text line)
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // 4. Reading an Integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // 5. Reading a Double (Decimal number)
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        // Displaying the gathered input back to the user
        System.out.println("\n--- User Profile ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);

        // 6. Close the scanner to prevent resource leaks
        scanner.close();
    }
}
