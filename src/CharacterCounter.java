import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CharacterCounter {
//class variables

    //constructors
    public  CharacterCounter(){}

    //methods
//count the number of times each character occurs in a string
//loop through string one character at a time, store/update the count
// print the results
    public void countCharacters(String wordToCount) {

        //make string case insensitive
        wordToCount = wordToCount.toLowerCase();



        //use char method to store chars in an array
    char[] arrayofChars = wordToCount.toCharArray();
    HashMap<Character, Integer> myCharacterCount = new HashMap<>();
    //for loop to loop through array
        for(int i = 0; i < arrayofChars.length; i++) {
            ////exclude all non-letters
            if(Character.isLetter(arrayofChars[i]) == false) {
                continue;
            }

         //add or update the count of each character into the hash map


            // create a variable to hold the count
         char theCharacter = arrayofChars[i];
         if(myCharacterCount.containsKey(theCharacter) == false) {
             //does NOT contain the key
             myCharacterCount.put(theCharacter, 1);
         } else {
             //Does contain the Key
             Integer theValue = myCharacterCount.get(theCharacter);
             theValue = theValue + 1;
             myCharacterCount.put(theCharacter, theValue);
         }
        }


        ArrayList<Character> myCharacterKeys = new ArrayList<>(myCharacterCount.keySet());
        //Loop through this and print on new lines
        for(int i = 0; i <myCharacterKeys.size(); i++){
            Integer theValue = myCharacterCount.get(myCharacterKeys.get(i));
            System.out.println(myCharacterKeys.get(i) + ":" + theValue);
        }
    }

    public String getUserInput(){
        Scanner myScanner = new Scanner(System.in);
        //create variable to contain input
        String myUsersInput = myScanner.nextLine();
        myScanner.close();

        return myUsersInput;
        //then go into main class and implement
    }

    public String getTextFromFile(String pathToTheFile) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(pathToTheFile)));

        } catch(Exception exception) {
            exception.printStackTrace();
        }
        return content;
    }
}

//count the number of times each character occurs in a string
//print the results to the console
