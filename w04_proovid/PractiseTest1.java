import java.util.ArrayList;

import jdk.javadoc.internal.doclets.toolkit.taglets.SummaryTaglet;

public class PractiseTest1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        int number = 10;
        int number2 = 34;
        int number3 = 36;
        numbers.add(number);
        numbers.add(number2);
        numbers.add(number3);
        double average = findAverage(numbers);
        System.out.println(average);

    }

    
    public static double findAverage(ArrayList<Integer> numbers){
        int sum=0;
        for (Integer i: numbers){
            sum+=i;
        }
        return sum/(double)numbers.size();
    }
}
