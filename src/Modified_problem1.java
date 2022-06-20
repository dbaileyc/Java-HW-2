import java.util.Scanner;
public class Modified_problem1 {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d;
        System.out.print(" Enter a : ");
        a = input.nextInt();
        System.out.print(" Enter b : ");
        b = input.nextInt();
        System.out.print(" Enter c : ");
        c = input.nextInt();
        System.out.print(" Enter d : ");
        d = input.nextInt();

        int Sum = sum(a, b, c, d);
        System.out.println( a + " + " + b + " + " + c + " + " + d + " " + " = " + Sum);

        int Multiply = multiply(a, b, d);
        System.out.println( a + " * " + b + " * " + d + " = " + Multiply);

        double Divide = divide(b, d);
        System.out.println( a + " * " + b + " = " + Divide);

        int Subtract = subtract(b, c);
        System.out.println( b + " / " + c + " = " + Subtract);

    }
    public static int sum( int a, int b, int c, int d){
        int result = a + b + c + d;
        return result;
    }
    public static int multiply(int a, int b, int d){
        int result = a * b * d;
        return result;
    }
    public static double divide(int b, int d){
        double result = b / d;
        return result;
    }
    public static int subtract(int b, int c){
        int result = b - c;
        return result;

    }
}
