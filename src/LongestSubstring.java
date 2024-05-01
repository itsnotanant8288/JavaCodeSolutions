// Link to Problem on LeetCode : https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

import java.util.HashSet;

public class LongestSubstring {
    public static String longestSubstring(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0, left = 0, right = 0;
        int startIdx = 0, endIdx = 0;

        while (right < n) {
            char currentChar = s.charAt(right);
            if (!set.contains(currentChar)) {
                set.add(currentChar);
                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    startIdx = left;
                    endIdx = right;
                }
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return s.substring(startIdx, endIdx + 1);
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println("Longest substring without repeating characters in '" + s1 + "': " + longestSubstring(s1) + ", length: " + longestSubstring(s1).length());
        System.out.println("Longest substring without repeating characters in '" + s2 + "': " + longestSubstring(s2) + ", length: " + longestSubstring(s2).length());
        System.out.println("Longest substring without repeating characters in '" + s3 + "': " + longestSubstring(s3) + ", length: " + longestSubstring(s3).length());
    }
}


