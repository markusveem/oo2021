import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class exceptions {
    public static void main(String[] args) {
        /*
        String[] pets = {"dog","cat","fish"};
        //System.out.println(pets[3]); // no 3rd element

        //int i = "nimi"; //exception --- time mismatch

        ArrayList<String> list = new ArrayList<String>();
        //list.get(0); // no elements in list

        ArrayList<String> list2 = null;
        //list.get(0); // null pointer exception*/


        /*int [] nums = new int[5];

        try {
            System.out.println("try 1");
            nums[10] = 25;
            nums[3] = 25;
            System.out.println("try 2");
            
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("catch 1");        
        }
        
        catch (Exception e) {
            System.out.println("in catch 2");

        }
        System.out.println("rest of programm");*/


        int[] nr1 = {4, 8, 16, 32};
        int[] nr2 = {2,0, 4, 8};


        for(int i= 0; i <nr1.length; i++){
            try {
                System.out.println(nr1[i] / nr2[i]);
            } catch (ArithmeticException e) {
                System.out.println("cant divide with 0");
            }
        }

    }    

   
}
