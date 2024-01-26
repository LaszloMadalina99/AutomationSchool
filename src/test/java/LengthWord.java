import java.util.Scanner;

public class LengthWord {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String inputStr = scanner.nextLine();
        String[] wordsArray = inputStr.split(" ");

        String longestWord = "";
        int longestLength = 0;
        for (String word : wordsArray) {
           // System.out.println(word);
            if(word.length() > longestLength){
                longestWord = word;
                longestLength = word.length();
            }
        }
        System.out.println("The most long word is: " +  longestWord
                + " and have numbers of letters:" + longestLength);
    }
}
