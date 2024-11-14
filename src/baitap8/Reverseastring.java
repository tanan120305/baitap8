package baitap8;

public class Reverseastring {

    public static void main(String[] args) {
        String s1 = "Hello";
        String reversed = new StringBuilder(s1).reverse().toString();
        System.out.println("Sau khi dao: " + reversed);
    }
}
