import java.util.Scanner;

public class FibonacciSequence_improved {
    static int[] memo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n for Fibonacci series: ");
        int n = scanner.nextInt();

        long startTime = System.currentTimeMillis();

        System.out.println("Fibonacci series up to " + n + " terms:");
        memo = new int[n + 1];
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("\nTime taken to execute: " + executionTime + " milliseconds");
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return memo[n];
    }
}
