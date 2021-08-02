import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class TestPuzzleJava {
    public static void main(String[] args) {
        // importing methods from PuzzlaJava
        PuzzleJava generator = new PuzzleJava();
        // getTenRolls method returns an array of 10 random numbers 1-20 inclusive
        System.out.println("getTenRolls method: array of 10 random digits");
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);

        // getRandomLetter method returns a random letter from the alphabet.
        System.out.println("getRandomLetter: Random letter from Alphabet");
        String testGetRandomLetter = generator.getRandomLetter();
        System.out.println(testGetRandomLetter);

        // generatePassword method
        System.out.println("generatePassword: creates random 8 character password");
        String testGeneratePassword = generator.generatePassword();
        System.out.println(testGeneratePassword);

        // getNewPasswordSet method creates array of elements
                // where each element is a random 8 character word
        System.out.println("getNewPasswordSet");
        ArrayList<String> testGetNewPasswordSet = generator.getNewPasswordSet(4);
        System.out.println(testGetNewPasswordSet);

        // SENSEI bonus: shuffleArray method
        System.out.println("Shuffle Array");
        String[] notShuffledArr = {"Word","Random","Stuff","Things","Hello","World"};
        String[] testShuffleArray = generator.shuffleArray(notShuffledArr);
        System.out.println(Arrays.toString(testShuffleArray));
    }
}