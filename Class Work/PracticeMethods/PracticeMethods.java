import java.util.Scanner;

public class PracticeMethods {
    static boolean testFirstLetter(String word){
        char firstLetter = word.charAt(0);
        return (firstLetter == 'a' || firstLetter == 'b');
    }

    static int specialNum(String word){
      int wordLength = word.length();
      return testFirstLetter(word) ? wordLength*10 : wordLength*4;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.next();
        int specialNumber = specialNum(word);
        System.out.printf("Special number is: %d\n", specialNumber);

    }
}
