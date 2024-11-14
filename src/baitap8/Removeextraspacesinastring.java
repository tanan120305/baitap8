package baitap8;
public class Removeextraspacesinastring {
public static void main(String[] args){
    String s1 = "Hello     World";
    String str = removeExtraSpaces(s1);
    System.out.println("Sau khi loai bo khoang trang: \"" + str + "\"");
}  
public static String removeExtraSpaces(String str) {
        
        return str.trim().replaceAll("\\s+", " ");
    }
}
