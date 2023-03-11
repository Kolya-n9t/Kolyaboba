package Lesson3;

import Lesson3.Donkey;

public class Pegasus extends Donkey {

    public Pegasus(String name){
        super(name);
}


    public static void main(String[] args){
        int wings = 2;
        System.out.println("Я Пегас, і у мене є " + wings + " крила");
    }

    }
