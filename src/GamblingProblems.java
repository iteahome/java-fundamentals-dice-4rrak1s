import java.util.Scanner;

public class GamblingProblems {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total numbers of rolls...");

        //NoR is the number of rolls, thus the array length.
        int NoR = sc.nextInt();

        //The Rolls are the actual dice values.
        int[] Rolls;
        Rolls = new int[NoR];

        for (int i = 0; i < NoR; i++) {
            if (i == 0) {
                System.out.println("Please enter a dice value...");
            } else {

                System.out.println("Please enter another dice value...");

            }
            Rolls[i] = sc.nextInt();

            while (Rolls[i] > 6 || Rolls[i] < 0) {
                System.out.println("Careful! You do not have a gambling problem! Please enter a valid value...");
                Rolls[i] = sc.nextInt();
            }

        }

        if (Rolls[NoR-1] == 6) {
            System.out.println("The last entered number cannot be 6...");

            //This can be added to force the user to add a correct value.
            //Rolls[NoR-1] = sc.nextInt();

            System.exit(-1);
        }

        int Counter = 0;
        for (int i = 0; i < NoR; i++) {
            if (Rolls[i] < 6) {
                Counter++;

            }

        }

        System.out.println("The number of girls playing dice is " + Counter);

    }
}

