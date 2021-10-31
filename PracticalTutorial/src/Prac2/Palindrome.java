package Prac2;

public class Palindrome {

    public static boolean isPalindrome1(String word) {
        for (int i = 0; i < word.length() / 2 ; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String word) {
        int i = 0;
        while (i < word.length() / 2) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
            i ++;
        }
        return true;
    }

    public static boolean isPalindrome3(String word) {
        // https://stackoverflow.com/questions/9107485/how-does-recursive-ispalindrome-function-work
        // Base case: know what to return (true/false)

        // check string already end
        if (word.length() < 2) {
            return true;
        }

        // check first and last character is equal or not
        if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
        }

        // recursive step: reduce problem -- smaller
        return isPalindrome3(word.substring(1, word.length() - 1));
    }

    public static boolean isPalindrome4(String word) {
        return helper(word, 0);
    }

    public static boolean helper(String word, int i) {
        if (i >= word.length() / 2) {
            return true;
        }

        // check first and last character is equal or not
        if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
            return false;
        }

        return helper(word, i + 1);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome4("AaaA"));
        System.out.println(isPalindrome4("madamimadam"));
        System.out.println(isPalindrome4("Mila"));
    }
}
