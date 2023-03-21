import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BoogieMan {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\\\Words.txt");
        Scanner scanner = new Scanner(file);
        Scanner keyBoard = new Scanner(System.in);
        List<String> wordList = new ArrayList<>();
        while(scanner.hasNext()){
            wordList.add(scanner.nextLine());
        }
        Random random = new Random();
        String word = wordList.get(random.nextInt(wordList.size()));
        System.out.println(word);

        List<Character> playGuess = new ArrayList<>();

        int wrongCount = 0;
        while (true){
            printBoogieMan(wrongCount);

            if (wrongCount >= 6){
                System.out.println("You lose! BOT!!!");
            }
            printWordStat(word, playGuess);
             if (getPlayerGuess(keyBoard, word, playGuess)){

             }
            if(printWordStat(word, playGuess)){
                System.out.println("Excellent work!");
                break;
            }
            System.out.println("Do you want enter your guess for the word ");
            if(keyBoard.nextLine().equals(word)){
                System.out.println("Great!");
            }
            else {
                System.out.println("Try again!");
            }
        }


    }
    public static boolean getPlayerGuess(Scanner keyBoard, String word, List<Character> playGuess){
        System.out.println("Please add first letter");
        String letterGuess = keyBoard.nextLine();
        playGuess.add(letterGuess.charAt(0));
        return word.contains(letterGuess);
    }
    public static boolean printWordStat(String word, List<Character> playGuess){
        int correctCount = 0;
        for (int w = 0; w < word.length(); w++) {
            if (playGuess.contains(word.charAt(w) )) {
                System.out.print(word.charAt(w));
                correctCount++;
            } else {
                System.out.print("_");
            }
        }
        System.out.println();
        return (word.length()==correctCount);
    }

    public static void printBoogieMan(Integer wrongCount) {
        if(wrongCount >= 1){
            System.out.println(" O");
        }
        if(wrongCount >= 2){
            System.out.print("\\ ");
            if(wrongCount >= 3){
                System.out.println("/");
            }
            else {
                System.out.println("");
            }
        }
        if(wrongCount >= 4){
            System.out.println(" |");
        }
        if(wrongCount >= 5){
            System.out.print("/ ");
            if(wrongCount >= 6){
                System.out.println("\\");
            }
            else {
                System.out.println("");
            }
        }
    }

}