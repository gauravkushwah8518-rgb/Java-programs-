import java.util.Scanner;
public class multiplyfloat {
    public static void main(String[]args){
         
        float a;
        float b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first num");
        a = sc.nextFloat(); 
        System.out.println("Enter second number");
        b = sc.nextFloat();
        float c =  a * b ;
        System.out.println("the number is " + c );


    }
    
}
