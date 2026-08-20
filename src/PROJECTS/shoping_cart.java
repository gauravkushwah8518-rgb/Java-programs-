import java .util.*;
public class shoping_cart {
    public static void main(String[] args) {

        // SHOPPING CART PROGRAM
        Scanner sc  = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("what item would you like to buy today?:");
        item = sc.nextLine();

            System.out.print("what is the price for each?:");
            price = sc.nextDouble();

            System.out.print("How many would you like?;");
            quantity = sc.nextInt();

            total = price * quantity;

            System.out.println("\nYou have bought" + quantity + " " + item +"/s");
            System.out.println("Your total is " + currency + total);

            sc.close();


        


    }
}
