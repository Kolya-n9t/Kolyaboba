package Lesson3;

public class Cat {
    int amount;
    static int catCount = 1;

    Cat (int catCount){
    this.catCount = catCount;
    Cat.catCount++;
    }
    public static void main(String[] args){
        System.out.println(Cat.catCount);
        Cat cat1 = new Cat(1);

        System.out.println(Cat.catCount);
        Cat cat2 = new Cat(2);

        System.out.println(cat1.catCount);
        System.out.println(cat2.catCount);
        System.out.println(Cat.catCount);
    }
}
