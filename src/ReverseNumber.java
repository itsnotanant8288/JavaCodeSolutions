// link : https://prepinsta.com/interview-preparation/technical-interview-questions/most-asked-coding-questions-in-placements/
import java.util.*;
import java.lang.Math;

public class ReverseNumber {
    public static int lengthOfNumber(int num)
    {   int count=0;
        while(num!=0)
        {
            count++;
            num /= 10;
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean is_negative = false;
        if(num < 0)
        {
            num *= -1;
            is_negative = true;
        }

        if(num < 10)
        {
            if(is_negative)
            {
                System.out.println("Reversed number : " + (-1 * num));
            }
            else
            {
                System.out.println("Reversed number : " + num);
            }
        }
        else
        {
            int temp=num;
            int len = lengthOfNumber(num);
            int opp=0;
            int mul= (int) Math.pow(10,len-1);
            while(temp!=0)
            {
                opp += temp%10 * mul;
                temp /= 10;
                mul /= 10;
            }
            if(is_negative)
            {
                System.out.println("Reversed number : " + (-1 * opp));
            }
            else
            {
                System.out.println("Reversed number : " + opp);
            }
        }
    }
}
