public class bitwise {
    public static void main(String[]args){
        int a = 2;
        int b = 3;
        int c = a & b;
        int d = a | b;
        int e= a ^ b;
        int f = ~a;
        System.out.println(c+","+d+","+e+","+f);
         
        // shift operators
        int g = 1 ;
        g = g << 1 ;
        int h;
        h= g >> 1 ;
        System.out.println(g+","+h);

        // logical operators
        int x = 10;
        int y = 20;
        boolean z = (x>y) && (y<x);
        System.out.println(z);
    }
}