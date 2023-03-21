package AllDZ;

import java.util.LinkedList;
import java.util.Queue;

public class FootballTeams {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("https:");
        queue.offer("//www.youtube.com/wat");
        queue.offer("ch?v=dQw");
        queue.offer("4w9WgXcQ");
        System.out.println();

        String meme;
        while ((meme = queue.poll()) !=null) {
            System.out.print(meme);
        }
    }
}



