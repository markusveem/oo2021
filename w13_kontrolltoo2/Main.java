import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {
      //readFile();
      anoterFileReader();
        int roadLenght = 10;
        
    }

   /* public static void readFile() throws FileNotFoundException {
        

        File file = new File("tekst.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){ 
            System.out.println(scanner.nextLine()); 
       }
    }*/

    public static void anoterFileReader() throws IOException {
        
        File file = new File("tekst.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
    
        String line = br.readLine();
        while (line != null){
          String[] lineData = line.split(",");
          System.out.println(lineData[0] + " | " + lineData[lineData.length-1]);
          line = br.readLine();
        }
    
        fr.close();
        br.close();
    }
}