import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int user = 0;
        int count = 1;


        int sum = 0;
        while (user <= 1) {
            System.out.print("Enter an integer n greater than 1: ");
            user = scan.nextInt();
            if(user<=1) System.out.println("Choose an integer greater than 0");
        }
        while (count <= user) {
            if (user % count == 0) {


                sum += count;

            } else {


            }
            count++;
        }

        System.out.println("the sum of all factors of " + sum);

    }
}


