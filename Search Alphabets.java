import java.util.*;

public class CheckIfAllLettersExist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        boolean[] alphabets = new boolean[26];
        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = false;
        }

        for (char c : str.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                alphabets[c - 'a'] = true;
            }
        }

        boolean foundAllLetters = true;
        for (boolean b : alphabets) {
            if (!b) {
                foundAllLetters = false;
                break;
            }
        }

        System.out.println(foundAllLetters ? "true" : "false");
    }
}
