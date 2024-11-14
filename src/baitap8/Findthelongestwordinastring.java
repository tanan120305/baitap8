package baitap8;

public class Findthelongestwordinastring {

    public static void main(String[] args) {
        String s1 = "I love programming";
        System.out.println("Tu dai nhat la: \"" + findLongestWord(s1) + "\"");
    }

    public static String findLongestWord(String str) {
        String longest = "";
        for (String word : str.split("\\s+")) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}
