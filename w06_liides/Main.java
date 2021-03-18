import java.util.Scanner; 

public class Main {
   public static void main(String[] args) {
        

   //ISIKU TUVASTAJA 3000
   
    System.out.println("Oled sa loom või inimene");
    System.out.println(" ");
    System.out.println("Loom --> L, Inimene--> I");

    Scanner scan = new Scanner(System.in);
    String who = scan.nextLine();

    if (who.equals("I")){
        System.out.println("oled inimene..Palju Õnne");
        System.out.println(" ");



        System.out.println("kas oled Eestlane või Soomlane");
        System.out.println(" ");
        System.out.println("eestlane -->E...Soomlane -->S");
        
        String nation = scan.nextLine();

        if (nation.equals("E")){
            Estonia();

        }else if(nation.equals("S")){
            Finland();
        }else{
            System.out.println("tekkis viga............Proovi veel");
        }

    }else{
        System.out.println("oled loom..Palju Õnne");

        System.out.println("aga mis loom sa oled");
        System.out.println("K --> koer; J-->janes");

        String animaltype = scan.nextLine();


        if (animaltype.equals("K")){
            System.out.println("Oled kutsu");
            Dog();
        }else{
            System.out.println("See on janes !");
            Rabbit();
        }
    }


    scan.close();
    // Isiku tuvastaja lõppeb
    
    }

    public static void Estonia() {
        
        System.out.println("Ma olen Eestlane");

        EstonianID est = new EstonianID("50107080839");

        System.out.println(est.getGender());
        System.out.println(est.getFullYear());
        System.out.println(est.getDOB());
        System.out.println(est.getAge());
    }

    public static void Finland() {
        
        System.out.println("Minä olen suomalainen");

        FinishID fin = new FinishID("230181-237J");

        System.out.println(fin.getGender());
        //System.out.println(fin.getFullYear());
        System.out.println(fin.getDOB());
        System.out.println(fin.getAge());
    }

    public static void Dog() {

        String action = "idle";
        Dog dog = new Dog(action);

        System.out.println(dog.eat());
        System.out.println(dog.sleep());
        System.out.println(dog.speak());
        System.out.println(dog.beSneaky());
        System.out.println(dog.lookAround());
        System.out.println(dog.attack());
        System.out.println(dog.defend());
        
    }
    public static void Rabbit() {
        
        String action = "idle";

        Rabbit rabbit = new Rabbit(action);

        System.out.println(rabbit.eat());
        System.out.println(rabbit.sleep());
        System.out.println(rabbit.speak());
        System.out.println(rabbit.beSneaky());
        System.out.println(rabbit.lookAround());
        System.out.println(rabbit.attack());
        System.out.println(rabbit.defend());

    }
}
