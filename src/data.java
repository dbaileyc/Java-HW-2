import java.util.Scanner;

public class data {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x;
        double y;
        double z;

        System.out.print("Enter x: ");
        x = input.nextDouble();
        System.out.print("Enter y: ");
        y = input.nextDouble();
        System.out.print("Enter z: ");
        z = input.nextDouble();

        if (x + 1 <= y && x + 1 <= z) {
            System.out.println("Increasing");
        } else if (y + 1 <= x && y + 1 >= z) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither");
        }
    }
}
