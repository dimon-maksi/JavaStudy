package org.example;

public class Palindrome {
    public static boolean isPalindrome(String word)
    {
        if (word == null) return true;

        word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = word.length()-1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
