import java.util.HashMap;
import java.util.Scanner;


public class Letter {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String sentence = scan.nextLine();
    System.out.println(sentence);
    getOccurance(sentence);
    }


    public static HashMap<Character,Integer> getOccurance(String sentence){

    
        HashMap<Character, Integer> dictionary = new HashMap<Character, Integer>();

        for (int i = 0; i < sentence.length(); i++){
            dictionary.put(sentence.charAt(i), 0); //paneb kõik tähed hashmappi
        }

        for (int i = 0; i < sentence.length(); i++){
            dictionary.put(sentence.charAt(i), dictionary.get(sentence.charAt(i)) + 1); //vaatab mitu on igat tähte hashmapis
        }
        
        System.out.println(dictionary);
        

    return dictionary;

    }
    

}
