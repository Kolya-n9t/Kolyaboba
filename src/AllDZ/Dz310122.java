package AllDZ;

import java.util.TreeSet;

public class Dz310122 {
    public static void main(String[] args) {
    TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Sasha", 16);
        Student st2 = new Student("Artem", 4);
        Student st3 = new Student("Andrey", 2);
        Student st4 = new Student("Danya", 5);
        Student st5 = new Student("Dima", 8);

        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);

        for(Student student : treeSet){
            System.out.println(student.getName());
        }

    }
}

class Student implements Comparable<Student>{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public int compareTo(Student other) {
        return name.compareTo(other.getName());

    }
    }