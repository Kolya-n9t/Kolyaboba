package Lesson3;

public class DZ2412 {
    public static void main(String[] args) {
        String n = "ABOBA";
        String m = "BAOBAB";
        System.out.println(isPalindrjne(n) ? "Yes" : "No");
        System.out.println(isPalindrjne(m) ? "Yes" : "No");
    }

    private static boolean isPalindrjne(String n) {
        if(n.length() == 1 || n.length() == 0)
            return true;
        if(n.charAt(0) == n.charAt(n.length() - 1))
            return isPalindrjne(n.substring(1, n.length() - 1));

        return false;
    }
    private static boolean isPalindrjnem(String m) {
        if(m.length() == 1 || m.length() == 0)
            return true;
        if(m.charAt(0) == m.charAt(m.length() - 1))
            return isPalindrjnem(m.substring(1, m.length() - 1));

        return false;
    }
}
