import java.util.*;

public class FrequencyOfCharactersInAString {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = scanner.next();
        s = s.toUpperCase();
        int len = s.length();

        for(int i=0;i<len;i++)
        {
            char c = s.charAt(i);
            if(map.containsKey(c))
            {
                map.compute(c, (k, a) -> a + 1);
            }
            else
            {
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
