import java.util.Scanner;

public class prob2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number greater than 0: ");
        int n = input.nextInt();
        while (n <= 0) {
            System.out.println("Please enter a number greater than 0: ");
            n = input.nextInt();
        }
        int[] array = new int[n];
        System.out.println("Enter " + n + " integers: ");
        for (int count = 0; count < array.length; count++) {
            array[count] = input.nextInt();
            System.out.print(array[count] + " ");
        }

        int max = array[0]; //starting at index 0 to search through the array//
        int min = array[0];
        int sum = 0;
        double avg;

        System.out.println();

        for (int count = 1; count < array.length; count++) //starting at 1  because integer has to be greater than 1//
        {
            if (array[count] > max) //array[count] = 5, max = 4  so max is now 5
            {
                max = array[count];//check the next number, array[count] = 8 max = 9, so max is not 8 its 9
            }

            if (array[count] < min) {
                min = array[count];
            }

            sum += array[count];

        }
        sum = sum + array[0]; //adding index 0 to get the average
        avg = (double) sum / n;
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.printf("Average " + avg);
        System.out.println();
        System.out.print("Elements greater than average: ");

        for (int count = 0; count < array.length; count++) {
            if (array[count] > avg) {
                System.out.print(array[count] + " ");
            }
        }


        System.out.println();
        System.out.print("Elements greater than 2: ");
        for (int count = 0; count < array.length; count++)
        {
            if (array[count] > array[array.length - 1])
            {
                System.out.println(array[count] + " " );
            }
        }
        System.out.println();
        System.out.print("Array in reverse order: ");
                for(int count = array.length - 1; count>= 0;count--){
                    System.out.print(array[count] + " ");
                }
    }
}



