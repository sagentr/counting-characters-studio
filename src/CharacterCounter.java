import java.util.ArrayList;
import java.util.HashMap;

public class CharacterCounter {
//class variables

    //constructors
    public  CharacterCounter(){}

    //methods
//count the number of times each character occurs in a string
//loop through string one character at a time, store/update the count
// print the results
    public void countCharacters(String wordToCount) {
        //use char method to store chars in an array
    char[] arrayofChars = wordToCount.toCharArray();
    HashMap<Character, Integer> myCharacterCount = new HashMap<>();
    //for loop to loop through array
        for(int i = 0; i < arrayofChars.length; i++) {
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
        } System.out.println(myCharacterCount);
        ArrayList<Character> myCharacterKeys = new ArrayList<>(myCharacterCount.keySet());
        System.out.println(myCharacterKeys);
        //Loop through this and print on new lines
        for(int i = 0; i <myCharacterKeys.size(); i++){
            Integer theValue = myCharacterCount.get(myCharacterKeys.get(i));
            System.out.println(myCharacterKeys.get(i) + ":" + theValue);
        }
    }

}
//count the number of times each character occurs in a string
//print the results to the console
