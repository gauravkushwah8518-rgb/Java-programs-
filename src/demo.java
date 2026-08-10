import java.util.Scanner;
public class demo {
  public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

int pin = 0;

while (pin != 1234) {
    System.out.print("Enter PIN: ");
    pin = sc.nextInt();
}

System.out.println("Login Successful");
  }
}