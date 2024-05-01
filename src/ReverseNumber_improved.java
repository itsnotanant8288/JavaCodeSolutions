// link : https://prepinsta.com/interview-preparation/technical-interview-questions/most-asked-coding-questions-in-placements/
import java.util.Scanner;

public class ReverseNumber_improved {
    public static int lengthOfNumber(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();
        int absoluteNumber = Math.abs(inputNumber);
        boolean isNegative = inputNumber < 0;

        if (absoluteNumber < 10) {
            System.out.println("Reversed number: " + (isNegative ? -inputNumber : inputNumber));
        } else {
            StringBuilder reversedNumberBuilder = new StringBuilder();
            int numberOfDigits = lengthOfNumber(absoluteNumber);
            int temp = absoluteNumber;
            while (temp != 0) {
                reversedNumberBuilder.append(temp % 10);
                temp /= 10;
            }
            int reversedNumber = Integer.parseInt(reversedNumberBuilder.toString());
            System.out.println("Reversed number: " + (isNegative ? -reversedNumber : reversedNumber));
        }
    }
}
