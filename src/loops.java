import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int user;
        int count = 1;

        System.out.print("Enter an integer n greater than 1: ");
        user = scan.nextInt();

        if (user < 1) {

            System.out.println("Choose a number greater than 1");

        }

else {
    System.out.println("the sum of all factors of " + count);

            while (count <= user) {

                if (user % count == 0) {

                    System.out.println(count);                    }

                count++;

                }
            }


        }
    }

