import java.util.*;

public class WildCardMatcher {
    public static boolean match(String str,String pattern)
    {
        if(str.isEmpty() && pattern.isEmpty())
        {
            return true;
        }

        if(pattern.isEmpty())
        {
            return false;
        }

        if(str.isEmpty())
        {
            return pattern.equals("*");
        }

        

        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = scanner.next();
        System.out.println("Enter the pattern : ");
        String pat = scanner.next();

        if(match(s,pat))
        {
            System.out.println("Pattern matches");
        }
        else
        {
            System.out.println("Pattern doesn't match");
        }
    }
}
