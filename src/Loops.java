import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int user = 0;
        int count = 1;


        while (user <= 1) {
            System.out.print("Enter an integer x: ");
            user = scan.nextInt();

            while (count <= user) {
                if (count % 3 == 0 && count % 2 == 1) {
                    System.out.println(count + " is multiple of 3");

                } else {

                }
                count++;
            }
        }
    }
}


