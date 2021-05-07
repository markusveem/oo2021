public class Salat {
    public static void main(String[] args) {
        insertFood();
    }

    public static void insertFood() {

        Food food = new Food();

        food.name = "kartul";
        food.rasv = 4.0;
        food.susivesik = 34.0;
        food.valk = 56.0;

        if(food.rasv + food.susivesik + food.valk > 100){
            System.out.println("viga andmetes");
        }

        Food food2 = new Food();

        food2.name = "vorst";
        food2.rasv = 4.0;
        food2.susivesik = 34.0;
        food2.valk = 56.0;

        if(food2.rasv + food2.susivesik + food2.valk < 100){
            System.out.println("viga andmetes");
        }
        
    }
    
}
