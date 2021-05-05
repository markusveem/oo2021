public class Main {

    public static void main(String[] args) {
        
        Bottle bottle = new Bottle();
        Drink drink = new Drink();
        BottleBox bottleBox = new BottleBox();
        drinkINbottleweight(bottle, drink);
        System.out.println("-------------------");
        System.out.println();
        System.out.println("-------------------");
        bottlePrice(bottle, drink);
        System.out.println("-------------------");
        System.out.println();
        System.out.println("-------------------");
        bottleInBox(bottle, drink);
        System.out.println("-------------------");
        System.out.println();
        System.out.println("ÜL 2");
        System.out.println();
        System.out.println("-------------------");
        fillBottles(bottle, drink);
        System.out.println("-------------------");
        System.out.println();
        System.out.println("ÜL 3");
        System.out.println();
        System.out.println("-------------------");
        Joogivaat(bottle, drink);
    }


    public static void drinkINbottleweight(Bottle bottle, Drink drink){
        

        if(drink.weight != 0){
            System.out.println("pudeli kaal koos joogiga on "+ (bottle.mass + drink.weight) + " kg");
        }else{
            System.out.println("pudeli kaal on " + bottle.mass);
        }
    }

    public static void bottlePrice(Bottle bottle, Drink drink){
        
        System.out.println("komplekti omahind on " + (bottle.capacity * drink.LitrePrice));
    }

    public static void bottleInBox(Bottle bottle, Drink drink) {
        BottleBox bottleBox = new BottleBox();



        System.out.println("kastis olevate pudelite hind on " + (bottleBox.boxPrice + (bottleBox.nrOfBottlesFitIn * (drink.LitrePrice *bottle.capacity))) + " eur");


    }


    // ÜL 2
    public static void fillBottles(Bottle bottle, Drink drink){
        Joogivaat joogivaat = new Joogivaat();

        int times = 0;
        double remaining = bottle.capacity;

        while(joogivaat.LitresInIt >= bottle.capacity){
            times++;
            joogivaat.LitresInIt = joogivaat.LitresInIt - bottle.capacity;
            remaining = joogivaat.LitresInIt;
            System.out.println(times + " pudelit täidetud : vaadis alles " + remaining + " liitrit");
        }

        if(remaining > 0){
            System.out.println("vaati jäi alles " + remaining + " liitrit");
    
             int BottlesCanbeStillFilled = (int) (remaining / bottle.capacity);
             //int BottlesCanbeStillFilled = Math.floorDiv(remaining, bottle.capacity);
             System.out.println("veel saab täita " + BottlesCanbeStillFilled + " pudelit");
    
             //BottlesCanbeStillFilled = remaining * BottlesCanbeStillFilled; 
             //int answer = Math.floorDiv(5, 2);
            }else{
                System.out.println("vaat on tühi");
            }

    }


    // ÜL 3
    public static void Joogivaat(Bottle bottle, Drink drink) {

        Joogivaat joogivaat = new Joogivaat();
        joogivaat.LitresInIt = 20;
        double remaining = bottle.capacity;
        BottleBox bottleBox = new BottleBox();


        //System.out.println("pudeli "+bottleCapacity);

        int times = 0;
        
        while(joogivaat.LitresInIt >= bottle.capacity && times != bottleBox.nrOfBottlesFitIn){
            times++;
            
            //remaining = joogivaat.LitresInIt - bottle.capacity;
            joogivaat.LitresInIt = joogivaat.LitresInIt - bottle.capacity;
            remaining = joogivaat.LitresInIt;
            System.out.println(times + " pudelit täidetud : vaadis alles " + remaining + " liitrit");
            
        }

        if(remaining > 0){
        System.out.println("vaati jäi alles " + remaining + " liitrit");

         int BottlesCanbeStillFilled = (int) (remaining / bottle.capacity);
         //int BottlesCanbeStillFilled = Math.floorDiv(remaining, bottle.capacity);
         System.out.println("veel saab täita " + BottlesCanbeStillFilled + " pudelit");

         //BottlesCanbeStillFilled = remaining * BottlesCanbeStillFilled; 
         //int answer = Math.floorDiv(5, 2);
        }else{
            System.out.println("vaat on tühi");
        }

        if(bottleBox.nrOfBottlesFitIn > times){
            System.out.println("täitmata jäi " +(bottleBox.nrOfBottlesFitIn - times )+" pudelit");
        }
       
        
    }

}