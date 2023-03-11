package Lesson3;

public class Tovar {
    String name;
    int cost;
    int rate;

    public static class Type{
        String name;
        String massive;
        Type milk  = new Type();
        Type meat  = new Type();
        Type fish  = new Type();
        Type drinks  = new Type();
    }
    public static class Basket{
        Basket buyproduct  = new Basket();

    }
    public static class User{
        String login;
        private int password;
        String buyproduct;
        User user = new User();
    }
}
