import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int l = s.length();
        int flag=1;
        if(l==1)
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            for(int i=l-1;i>l/2;i--)
            {
                if(s.charAt(i)!=s.charAt(l-1-i))
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            {
                System.out.println("It is a palindrome");
            }
            else
            {
                System.out.println("It is not a palindrome");
            }
        }
    }
}
