import java.util.*;
import java.lang.Math;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int gcd = 1;
        for(int i=1;i<=Math.min(num1,num2);i++)
        {
            if((num1 % i == 0)&&(num2 % i == 0))
            {
                gcd = i;
            }
        }
        System.out.println("GCD : "+gcd);
    }
}
