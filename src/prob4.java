import java.util.Scanner;
public class prob4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer n greater than 10: ");
        int n = input.nextInt();

        while (n <= 10) {
            System.out.println("Please enter an integer greater than 10");
            n = input.nextInt();
        }

        int[] array = new int[n];
        int min =2;
        int max = 75;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random()  * (max-min)) + min);
            System.out.println(array[i]);

            if(i==2 || i==5 || i == 7 || i==9)
            {
                sum += array[i];
        }
    }
        System.out.println("sum:" +sum);

        int temp = array[2];
        array[2] = array[6];
        array[6] = temp;


        temp = array[4];
        array[4] = array[7];
        array[7] = temp;

        sum =0;

        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
            if(i==2 || i==5 || i == 7 || i==9)
            {
                sum += array[i];
            }
        }
        System.out.println("sum:" +sum);
        }
        }


