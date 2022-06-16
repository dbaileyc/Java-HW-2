import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {



     Scanner akd = new Scanner(System.in);
     System.out.print("Enter a: ");
     int  a = akd.nextInt();
     System.out.print("Enter b: ");
    int  b = akd.nextInt();
     System.out.print("Enter c: ");
     int c = akd.nextInt();
     System.out.print("Enter d: ");
     int d = akd.nextInt();


        int sum = sum(a,b,c,d);
        int multiply = multiply(a,b,d);
                int divide = divide(b,d);
                int subtract = subtract(b,c);




        System.out.println(sum);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(subtract);



    }
    public static int sum(int a, int b, int c, int d){
        int result = a + b + c + d;
        return result;
    }
    public static int multiply(int a,int b,int d) {
        int result1 = a * b * d;
        return result1;
    }
    public static int divide (int b, int d) {
        int result3 = b / d;
        return result3;
    }
    public static int subtract(int b, int c) {
        int result4 = b - c;
        return result4;
    }






}
