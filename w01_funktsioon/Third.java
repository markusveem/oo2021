import java.util.Scanner; 

public class Third {
    public static void main(String[] args) {
     
  
      myMath();
    }
    



    
    public static void myMath(){

      System.out.println("Selle funktsiooni saab kasutada ruutu/kuupi ja ruut/kuupjuurt");
      System.out.println("sisetage number");
      Scanner scan = new Scanner(System.in);
      int number = scan.nextInt();
      
      
      System.out.println("kas soovite astendada või juurida?");
      System.out.println("astendamiseks kirjutage '1' juurimiseks kirjutage '2'");
      int tegevus = scan.nextInt();
      
      
      if (tegevus == 1){
        System.out.println("mis astmesse soovite arvu panna");
        int aste = scan.nextInt();  
        String numberinf = "number " + number +" astendamise vastus on..";
        System.out.println(numberinf);
        int ruut = (int) Math.pow(number, aste);
        System.out.println(ruut);
      }else if (tegevus == 2){

        //int juuraste = scan.nextInt();  
        
        String numberinfjuur = "number " + number +" ruutjuur on..";
        System.out.println(numberinfjuur);
        float ruutjuur = (float) Math.sqrt(number);  
        System.out.println(ruutjuur);
      }else{
          System.out.println("esines viga, proovi veel");
      }
        
      /*int ruut = (int) Math.pow(number, aste);
      System.out.println(ruut);
      String numberinfjuur = "number " + number +" ruutjuur on..";
      System.out.println(numberinfjuur);
      float ruutjuur = (float) Math.sqrt(number);  
      System.out.println(ruutjuur);*/
    }

  }