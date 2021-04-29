
 /*Luua mingisugune näide lisaks, mis kasutab kuidagi
reaaleluliselt stream-i näidet, kus kasutad vähemalt
 5 chaining meetodit, tulemused võiks ka salvestada faili,
lugeda võib samuti failist.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.ArrayList;
public class HomeWorkStream {


    public static void main(String[] args) {
        ArrayList<Integer> weight = getweight();
        System.out.println(weight);

        new Thread(getAmount(weight)).start();
        new Thread(getAverageWeight(weight)).start();
        new Thread(getOver100(weight)).start();

    }

    public static ArrayList<Integer> getweight() {
        ArrayList<Integer> weight = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("weight.txt"))) {
            while (scanner.hasNextLine()) {
                weight.add(Integer.parseInt(scanner.nextLine()));
            }
            return weight;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return weight;
        }
    }

    public static Runnable getAmount(ArrayList<Integer> weight) {
        return () -> {
            System.out.println("inimeste arv failis: " + weight.stream().count());
        };
    }

    public static Runnable getOver100(ArrayList<Integer> weight) {
        return () -> {
            int[] ints = weight.stream().mapToInt(i -> i).toArray();
            System.out.println("Kas oli inimese kes kaalusid alla 50 kilo: " + IntStream.of(ints).anyMatch(e -> e <= 100));
        };
    }

    public static Runnable getAverageWeight(ArrayList<Integer> weight) {
        return () -> {
            int[] ints = weight.stream().mapToInt(i -> i).toArray();
            // average age
            System.out.println("keskmine kaal: " + IntStream.of(ints).average().getAsDouble());
        };
    }

   

}
    

