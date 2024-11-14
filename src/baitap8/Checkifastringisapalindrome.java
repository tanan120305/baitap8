package baitap8;

public class Checkifastringisapalindrome {

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        String[] stringsToCheck = {"madam", "hello"};
        for (String str : stringsToCheck) {
            boolean isPalindrome = isPalindrome(str);

            System.out.println(str + (isPalindrome ? " la mot Palindrome." : " khong phai la Palindrome."));

        }
    }
}
