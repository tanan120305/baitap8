package baitap8;

public class Splitwordsinastring {

    public static void main(String[] args) {
        String s1 = "Java is fun ";
        String[] words = splitWords(s1);
//    for( String word : words ){
//        System.out.println(word);
//    }
//}   
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]); 
            if (i < words.length - 1) {
                System.out.print(", "); 
            }
        }
    }

    public static String[] splitWords(String str) {
        return str.split(" ");
    }
}
