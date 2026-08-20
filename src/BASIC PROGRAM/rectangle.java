import java.util.*;
public class rectangle {
    public static void main(String[] args) {
        
        double length;
        double width;
        
        Scanner sc = new Scanner (System.in);

        System.out.print("enter length of rectangle :");
        length = sc.nextFloat();

        System.out.print("enter width of rectangle :");
        width = sc.nextFloat();

         double area = length * width ;

        System.out.println("area of rectangle is :" +area+ "cm");

        sc.close();
    }
}

