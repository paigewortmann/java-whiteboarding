import java.util.Scanner;

public class Permutations {

    public static void main(String args[]) {

        boolean valid = true;
        Scanner scanner = new Scanner(System.in);

        while (valid) {

            System.out.print("Enter a word: ");

            String userWord = scanner.nextLine();

            if (userWord.isEmpty() || userWord == null) {
                System.out.println("Please enter a valid value");
                System.out.print("Enter a word: ");
                userWord = scanner.nextLine();
                valid = false;
            }

            System.out.println("all permutations of this word: ");
            allPermutations(userWord);

            valid = false;
        }
    }

    public static void allPermutations(String str) {
        allPermutations("", str);
    }

    private static void allPermutations(String permutation, String word) {
        if (word.isEmpty() || word == null) {
            System.out.println(permutation + word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                allPermutations(permutation + word.charAt(i), word.substring(0, i)
                                + word.substring(i + 1, word.length()));
            }
        }
    }




}
