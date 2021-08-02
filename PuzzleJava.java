import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    Random randMachine = new Random();
    // public int methods(){ }
    // getTenRolls generate array with 10 random numbers between 1-20 inclusive
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int i = 0;
        while(i<10) {
            int rand = randMachine.nextInt(20) + 1;
            result.add(rand);
            i++;
        }
        return result;
    }
    // getRandomLetter creates array with all 26 letters of alphabet,
            //generate random index between 0 and 25 and 
            //use it to pull a random letter out of the array, return the random letter
    public String getRandomLetter() {
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int rand = randMachine.nextInt(25);
        String result = alphabet[rand];
        return result;
    }
    // generatePassword use previous method to create a random string of 8 characters
            // return randomly generated string
    public String generatePassword() {
        String result = "";
        for (int i=0; i<10; i++) {
            result += getRandomLetter();
        }
        return result;
    }
    // getNewPasswordSet method that takes int length as an argument and 
            // creates an array of random 8 character words.
            // the array should be the length passed in as an int
    public ArrayList<String> getNewPasswordSet(int num) {
        ArrayList<String> result = new ArrayList<String>();
        for (int i=0; i<num; i++) {
            result.add(generatePassword());
        }
        return result;
    }
    // shuffleArray method takes array and mixes values in pseudo-random way
            // use random indexes within the array and swap values repeatedly
    public String[] shuffleArray(String[] array) {
        int bound = array.length;
        String temp = array[0];
        for (int i=0; i<bound;i++) {
            int rand = randMachine.nextInt(bound);
            temp = array[i];
            array[i] = array[rand];
            array[rand] = temp;
        }
        return array;
    }
}