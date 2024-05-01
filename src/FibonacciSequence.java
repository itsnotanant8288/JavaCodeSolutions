import java.util.*;

public class FibonacciSequence {
    public static int Fib(int num)
    {
        if(num==0)
        {
            return 0;
        }
        if(num==1)
        {
            return 1;
        }

        return Fib(num-1)+Fib(num-2);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the nth term value for fibonacci sequence: ");
        int n = scanner.nextInt();

        long startTime = System.currentTimeMillis();

        for(int i=0;i<n;i++)
        {
            System.out.println(i+"th term : "+Fib(i));
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("\nTime taken to execute: " + executionTime + " milliseconds");
    }
}
