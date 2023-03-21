package AllDZ;

import java.util.LinkedList;

public class Box {
    public static void main(String[] args) {
        LinkedList<PostBox> boxes = new LinkedList<>();
        boxes.add(new PostBox(30, 50, 40, 853));
        boxes.add(new PostBox(25, 53, 34, 690));
        boxes.add(new PostBox(40, 87, 70, 2));
        boxes.add(new PostBox(87, 80, 91, 6));
        boxes.add(new PostBox(5, 8, 7, 60));
        boxes.add(new PostBox(64, 55, 60, 3));
        boxes.add(new PostBox(104, 124, 114, 14));
        boxes.add(new PostBox(54, 16, 32, 1));
        boxes.add(new PostBox(10, 11, 12, 90));
        boxes.add(new PostBox(180, 169, 200, 18));

        for (int i = 0; i < 5; i++) {
            Box box = new Box();

            System.out.println("The box exceeds the maximum weight. You need to pay extra.");
        }

    }
}
