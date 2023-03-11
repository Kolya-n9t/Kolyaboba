package Lesson3;

public class Lesson15 {
    public static void main(String[] args) {
String s = "I like football!!!";
stringMethoads(s);
    }
    public static void stringMethoads(String s) {
        System.out.println(s);
        System.out.println(s.charAt(s.length()-1));
        System.out.println(s.endsWith("!!!"));
        System.out.println(s.startsWith("I like"));
        System.out.println(s.contains("Java"));
        System.out.println(s.replace('a' , 'o'));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.substring(4 , 32));
    }
}
