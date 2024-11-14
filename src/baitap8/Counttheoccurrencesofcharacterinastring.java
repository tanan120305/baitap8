package baitap8;

public class Counttheoccurrencesofcharacterinastring {

    public static void main(String[] args) {
        String s1 = "hello world ";
        int cnt = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c == 'o') {
                cnt++;
            }
        }
        System.out.println("so lan xuat hien la: " + cnt);
    }
}
