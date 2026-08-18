import java .util.Scanner;
public class lcm {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        
        int lcm;
        int max = Math.max(a,b);

        lcm = max;

        while(true){
            if (lcm % a == 0 && lcm % b == 0){
                break;
            }
            
            lcm ++;
        }
        
        System.out.println("lcm is " + lcm);
    }
    
    
}
