import java.util.Scanner; // 1. Import the Scanner class

public class i {
    public static void main(String[] args) {
        int i = 10;  //assign value
        int y = 5;
        Scanner sc = new Scanner (System.in);

        System.out.println("enter first number");
        i = sc.nextInt();                               //USER INPUT
        System.out.println("enter second number");
        y = sc.nextInt();

        int sum = i + y;
        System.out.println("print sum ="+sum);      // OUTPUT
        sc.close();
    }
}





