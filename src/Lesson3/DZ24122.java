package Lesson3;

public class DZ24122 {
    public static void main(String[] args) {
        StringBuffer strBuffer = new StringBuffer("=");
        strBuffer.replace(0, 1, "Дорівнює");
        System.out.println(strBuffer.toString());
    }
}
