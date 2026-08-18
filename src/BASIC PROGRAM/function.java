import java.util.Scanner;

public class function {

    public static void main(String[] args) {

        int a;
        int b;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = scanner.nextInt();

        System.out.print("Enter second number: ");
        b = scanner.nextInt();

        if(b==0){
            System.out.println("division by zero is not possible");
        } else {
             System.out.println("Division = " + divide(a, b));
        }

    }

    
    

    public static int divide(int a, int b) {
        return a / b;
    }
}
