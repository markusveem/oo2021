
//siin on lihtsalt mõned listid mapid ja setid
//arraylist
import java.util.ArrayList; // importing; 
import java.util.HashSet;
import java.util.HashMap;





public class Practise {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        numberid();
        countries();
      }

      // linked list pmst sama aga andmeid hoitakse "containerites"


      // hashset --- every item has to be unique

      public static void numberid() {

      
        HashSet<Integer> numbers = new HashSet<Integer>();
    
        // Adding values
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
    
        // Show which numbers between 1 and 10 are in the set
        for(int i = 1; i <= 10; i++) {
          if(numbers.contains(i)) {
            System.out.println(i + " was found in the set.");
          } else {
            System.out.println(i + " was not found in the set.");
          }
        }
      }

      //hashmap
      //store items in "key/value" pairs,

      public static void countries() {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();
    
        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        
        capitalCities.get("England"); //paaseb ligi ka londonile
      }
 
    }
    


