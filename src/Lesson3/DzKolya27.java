package Lesson3;

import java.util.HashMap;
public class DzKolya27{
    public static void main(String[] args) {
        String st = "Counting the number of specific words";
        String[] words = st.split(" ");
        HashMap<String, java.lang.Integer> keyValue = new HashMap<String, java.lang.Integer>();
        for (int i=0; i<= words.length-1; i++) {
            if (keyValue.containsKey(words[i])) {
                int counter = keyValue.get(words[i]);
                keyValue.put(words[i], counter+1);
            }
            else {
                keyValue.put(words[i], 1);
            }
        }
        System.out.println(keyValue);
    }
}
