import java.util.Scanner;

public class CharOfString {

    public static void main(String[] args) {
        //user write
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a string: ");
        String insertstr = scanner.nextLine();
        scanner.close();
        int length = insertstr.length();
        if (length>0){
            char firstletter = insertstr.charAt(0);
            char lastletter = insertstr.charAt(length-1);
            char midletletter = insertstr.charAt(length/2);
            System.out.println("First: "+ firstletter + " last: " + lastletter + " middle: " + midletletter);
            int spaceCount = 0;

            for (int i = 0; i < insertstr.length(); i++) {
                // Check if the character at position i is a space
                if (insertstr.charAt(i) == ' ') {
                    spaceCount++;
                }
            }
            System.out.println("Number of space is: "+ spaceCount);

            int dotIndex = insertstr.indexOf('.');
            if (dotIndex != -1) {
                // extract string after the first point
                String resultSubstring = insertstr.substring(dotIndex);
                //String resultSubstring = insertstr.substring(0, dotIndex+1); - extract syting before first point
                System.out.println("Substring up to and including the first period: " + resultSubstring);
            } else {
                System.out.println("No period found in the string.");
            }


        }

    }
}