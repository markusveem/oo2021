public class Salat {
    public static void main(String[] args) {
        insertFood();
        Foodcomponents();
        foodRecipe();
        
    }

    public static void insertFood() {

        Food food = new Food();

        food.name = "kartul";
        food.rasv = 4.0;
        food.susivesik = 34.0;
        food.valk = 56.0;
        int foodnr = 1;


        if(food.rasv + food.susivesik + food.valk > 100){
            System.out.println("viga toidus " + foodnr);
        }else{
            System.out.println(" ");
            System.out.println("nimi: " + food.name);
            System.out.println("rasv: " + food.rasv);
            System.out.println("susivesik: " + food.susivesik);
            System.out.println("valk: " + food.valk);
            System.out.println(" ");


        }

        Food food2 = new Food();

        food2.name = "vorst";
        food2.rasv = 4.0;
        food2.susivesik = 34.0;
        food2.valk = 56.0;
        foodnr = 2;

        if(food2.rasv + food2.susivesik + food2.valk > 100){
            System.out.println("viga toidus " + foodnr);
        }else{
            System.out.println(" ");
            System.out.println("nimi: " + food2.name);
            System.out.println("rasv: " + food2.rasv);
            System.out.println("susivesik: " + food2.susivesik);
            System.out.println("valk: " + food2.valk);
            System.out.println(" ");



        }
        
    }

    public static void Foodcomponents() {

        Foodcomponent foodcomponent = new Foodcomponent();
        Kartul kartul = new Kartul();
        foodcomponent.amount = 100;//grammides palju on

        Foodcomponent foodcomponent2 = new Foodcomponent();
        Vorst vorst = new Vorst();
        foodcomponent2.amount = 50;

        Foodcomponent foodcomponent3 = new Foodcomponent();
        Hapukoor hapukoor = new Hapukoor();
        foodcomponent3.amount = 30;

    System.out.println("rasvakoguse arvutamine...");
    System.out.println("kartuleid on" +foodcomponent.amount+"g");
    System.out.println("vorsti on" +foodcomponent2.amount+"g");
    System.out.println("hapukoort on" +foodcomponent3.amount+"g");


    
    double rasv = kartul.rasv + vorst.rasv + hapukoor.rasv;
    double kogurasv = foodcomponent.amount + foodcomponent2.amount + foodcomponent3.amount;

   System.out.println( (rasv / kogurasv) * 100);        
    }

    public static void foodRecipe() {
        Kartulisalat kartulisalat = new Kartulisalat();
        System.out.println("täna teeme " + kartulisalat.name);
        System.out.println("rasva: " + kartulisalat.rasv);
        System.out.println("valku: " + kartulisalat.valk);
        System.out.println("susivesikuid: " + kartulisalat.susivesik);
        System.out.println(kartulisalat.whatsin);



        
    }
    
}
