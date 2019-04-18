import java.util.Scanner;

public class CollatzConjecture {

    public static void main(String[] args) {
        int totalCalcs = 0, oddNum = 0, evenNum = 0;
        long startNum, tempNum, highestNum = 1;
        System.out.println("Enter an integer for the Collatz Conjecture: ");
        Scanner input = new Scanner(System.in);
        startNum = input.nextLong(); //to print later
        input.nextLine();
        tempNum = startNum;

        while (tempNum != 1) {
            if (tempNum % 2 == 0) //while even
            {
                tempNum = tempNum / 2;
                evenNum++;
            } else //while odd
            {
                tempNum = (tempNum * 3) + 1;
                oddNum++;
            }

            if (tempNum > highestNum) {
                highestNum = tempNum;
            }

            totalCalcs++;
            System.out.print(tempNum + " ");
        }

        System.out.printf("\nCollatz Conjecture of %d completed in %d steps with %d even numbers, and %d odd numbers. The highest number was %d.", startNum, totalCalcs, evenNum, oddNum, highestNum);

    }//end main void
}//end Main class