package baitap8;

public class Countthenumberofwordsinastring {

    public static void main(String[] args) {
        String s1 = "Java is fun";
        System.out.println("So tu trong chuoi: " + countWords(s1));
    }

    public static int countWords(String str) {
        return (str == null || str.trim().isEmpty()) ? 0 : str.trim().split("\\s+").length;
    }
}
