import java.util.Scanner;

public class Blender implements ProgramInterface {

    private String rating;

    public Blender(String rating){
        this.rating = rating;
    }

    Scanner scan = new Scanner(System.in);
    //String rate = scan.nextLine();
    

    @Override
    public String useful() {
        System.out.println("how useful is this program");
        rating = "very";
        String rate = scan.nextLine();

        //return "usefulness: " + rating;
        return rate;
    }

    @Override
    public String easy() {
        System.out.println("how easy to use is this program");

        String rate = scan.nextLine();
        rating = "most begginer friendly pro software ";
        //return "how easy it is to use"+ rating;
        return rate;
    }

    @Override
    public String price() {
        System.out.println("how pricy is this program");

        String rate = scan.nextLine();

        rating = "pricy";
        //return "price: " +rating;
        return rate;
    }

    @Override
    public String fun() {
        System.out.println("how fun to use is this program");

        String rate = scan.nextLine();

        rating = "very fun";
        //return "how fun is using it:"+ rating;
        return rate;
    }
    
}
