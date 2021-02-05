import static java.lang.Math.pow;

import javax.print.attribute.standard.PrinterInfo;

import jdk.javadoc.internal.doclets.formats.html.resources.standard;

public class Second {
    public static void main(String[] args) {
        System.out.println(myName());
        System.out.println(add(5,10));
        System.out.println(fullName("Markus", "Meem"));
        System.out.println(CheckEqual(4, 4));
        System.out.println(notEqual (4, 4));

        myMath();
        
    }
    public static String myName(){
        return "akuseem";
    }

    public static int add (int number1, int number2){
        return number1 + number2;

    }

    public static String fullName(String Firstname, String LastName){
        return Firstname + " " + LastName + " ! ";
    }

    Public static void myMath(){
        System.out.println(pow(5, 2));

        System.out.println(Math.sqrt(9));
        
    }

    public static void myLogical(){
        System.out.println(5 < 10 && 5 > 4);
        System.out.println(6 < 8 || 3 == 3);

    } 
    public static void areStringsEqual(){
        String name1 = "Markus";
        String name2 = "Markus";

        System.out.println(name1 == name2);

        String newName1 = new String("Markus"); //uus objekt
        String newName2 = new String("Markus"); //uus objekt

        System.out.println(newName1 == newName2);

        System.out.println(newName1.equals(newName2));



    }
}
//function add (number1 number2)
// || = or