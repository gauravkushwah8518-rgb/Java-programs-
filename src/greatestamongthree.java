
import java.util.Scanner;

public class greatestamongthree {
    public static void main(String[]args){
        int a;
        int b;
        int c;
        Scanner sc = new Scanner (System.in);
           System.out.println("enter a number ");
           a = sc.nextInt();
           System.out.println("enter second number");
           b = sc.nextInt();
           System.out.println("enter third number");
           c = sc.nextInt();

           if(a>b && a>c){
            System.out.println(a + " is greater");
           } else if(b>a && b>c){
            System.out.println(b + " is greater");
           } else{
            System.out.println(c + " is greater");
           }
           sc.close();
    }
    
}
