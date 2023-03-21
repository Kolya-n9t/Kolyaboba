package AllDZ;

import java.util.HashMap;

public class Product {

    public static void main(String[] args) {
  HashMap <Object , Object> hashMap = new HashMap<>();
  Toys toy1 = new Toys("Doll" , "red" , 1);
        Toys toy2 = new Toys("Car" , "blue" , 2);
        Toys toy3 = new Toys("Animal" , "green" , 0);
        Toys toy4 = new Toys("Ship" , "white" , 3);
        Toys toy5 = new Toys("Machine" , "black" , 2);

        hashMap.put("Doll" , 1);
        hashMap.put("Car" , 2);
        hashMap.put("Animal" , 3);
        hashMap.put("Ship" , 4);
        hashMap.put("Machine" , 5);

System.out.println(hashMap);
    }
}
class Toys implements Comparable<Toys>{
    String name;
    String color;
    int weight;


    public Toys(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Toys{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Toys other) {
        return name.compareTo(other.getName());
    }
}