package Lesson3;

public class DZ2710 {

    int number;
    int model;
    int weight;
    public DZ2710(int number) {
        this.number = number;
        weight = 200;
    }

    public DZ2710(int number, int weight) {
        this.number = number;
        this.weight = weight;


        }
public void displayInfo() {

    System.out.println(number + " " + weight);
}
    public static void main (String[]args){
        DZ2710 number1 = new DZ2710(1234567, 200);
        DZ2710 number2 = new DZ2710(7654321, 150);
        DZ2710 number3 = new DZ2710(8593017, 175);

    }
}





