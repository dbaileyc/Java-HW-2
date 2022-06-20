import java.util.Scanner;

public class Problem2 {
    private static Scanner sc;
    public static void main(String[] args)
    {
        int number, i, evenSum = 0;
        sc = new Scanner(System.in);

        System.out.print("Enter integer n: ");
        number = sc.nextInt();

        for(i = 1; i <= number; i++)
        {
            if(i % 2 == 0)
            {
                evenSum = evenSum + i;
            }
        }
        System.out.println("The sum of all even numbers between 1 and " + number + " is: " + evenSum);
    }
}

