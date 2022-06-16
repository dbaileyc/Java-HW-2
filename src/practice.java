

public class practice {
    public static void main(String[] args) {
        int sum = subtract(1, 8);
        int sum2 = subtract(2, 7);
        int sum3 = subtract(3, 8);

        int sum4 = multiply(3, 5);
        int sum5 = multiply(7, 8);
        int sum6 = multiply(9, 3);

        int sum7 = modulus(8,93);
        int sum8 = modulus(7,122);

        System.out.println("The sum is " + sum);
        System.out.println("The sum is " + sum2);
        System.out.println("The sum is " + sum3);
        System.out.println("The sum is " + sum4);
        System.out.println("The sum is " + sum5);
        System.out.println("The sum is " + sum6);

        System.out.println("The sum is " + sum7);
        System.out.println("The sum is " + sum8);
    }

    public static int subtract(int a, int b) {
        int result = a - b;
        return result;
    }

    public static int multiply(int n1, int n2) {
        int result = n1 * n2;
        return result;
    }

    public static int modulus(int n4, int n5) {
        int result = n5 % n4;
        return result;
    }
}
