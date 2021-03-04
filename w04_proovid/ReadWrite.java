import java.io.*;
import java.io.FileWriter;
import java.util.Scanner;
public class ReadWrite {
   public static void main(String[] args) throws FileNotFoundException {
       File file = new File("filepath");
       Scanner scan = new Scanner(file);
       
       while (scan.hasNextLine()){ //tõmbab tsükllise ja saab kõige read
            System.out.println(scan.nextLine()); //first line
       }
   
    }

    
    //uute faili kirjutamine
    
    /*public static void main(String[] args) throws IOException {
       File file = new File("filepath");
       Scanner scan = new Scanner(file);
       
       String filecontent = "";
       while (scan.hasNextLine()){ //tõmbab tsükllise ja saab kõige read
            filecontent = filecontent.concat(scan.nextLine()+ "\n");
       }

       FileWriter fileWriter = new FileWriter("filepath");
       fileWriter.write(filecontent);
       fileWriter.close();
   
    }


    */
}
