// link : https://prepinsta.com/interview-preparation/technical-interview-questions/most-asked-coding-questions-in-placements/
import java.util.*;

public class Anagram {
    public static boolean isAnagram(String str1,String str2)
    {
       String s1= str1.replaceAll("[\\s]","");
       String s2= str2.replaceAll("[\\s]","");

        if(s1.length()!=s2.length())
        {
            return false;
        }

        char[] a1 = s1.toLowerCase().toCharArray();
        char[] a2 = s2.toLowerCase().toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();

        if(isAnagram(s1,s2))
        {
                System.out.println("They are Anagram");
        }
        else
        {
                System.out.println("They are not Anagram");
        }
    }
}
