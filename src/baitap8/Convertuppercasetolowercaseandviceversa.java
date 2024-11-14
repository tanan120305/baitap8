package baitap8;

public class Convertuppercasetolowercaseandviceversa {

    public static void main(String[] args) {
        String s1 = "Hello World";
        StringBuilder bd = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (Character.isUpperCase(c)) {
                bd.append(Character.toLowerCase(c));
            } else {
                bd.append(Character.toUpperCase(c));
            }
        }
        System.out.println(bd);
    }
}
