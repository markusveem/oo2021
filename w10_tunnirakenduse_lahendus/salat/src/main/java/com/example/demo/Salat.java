package com.example.demo;

public class Salat {
    public static void main(String[] args) {
        //insertFood();
        Foodcomponents();
    }

    public static void insertFood() {

        FoodClass food = new FoodClass();

        food.name = "kartul";
        food.rasv = 4.0;
        food.susivesik = 34.0;
        food.valk = 56.0;
        int foodnr = 1;


        if(food.rasv + food.susivesik + food.valk < 100){
            System.out.println("viga toidus " + foodnr);
        }

        FoodClass food2 = new FoodClass();

        food2.name = "vorst";
        food2.rasv = 4.0;
        food2.susivesik = 34.0;
        food2.valk = 56.0;
        foodnr = 2;

        if(food2.rasv + food2.susivesik + food2.valk < 100){
            System.out.println("viga toidus " + foodnr);
        }
        
    }

    public static void Foodcomponents() {

        Foodcomponent foodcomponent = new Foodcomponent();
        Kartul kartul = new Kartul();
        foodcomponent.amount = 100;

        Foodcomponent foodcomponent2 = new Foodcomponent();
        Vorst vorst = new Vorst();
        foodcomponent.amount = 50;

        Foodcomponent foodcomponent3 = new Foodcomponent();
        Hapukoor hapukoor = new Hapukoor();
        foodcomponent.amount = 30;

    System.out.println("rasvakoguse arvutamine...");

    double rasvakogus1 = kartul.rasv + kartul.rasv * (foodcomponent.amount / 100);
    double rasvakogus2 = vorst.rasv + vorst.rasv * (foodcomponent2.amount / 100);
    double rasvakogus3 = hapukoor.rasv + hapukoor.rasv * (foodcomponent3.amount / 100);

    double kogurasv = rasvakogus1 + rasvakogus2 + rasvakogus3;

    System.out.println(kogurasv);



        
        
    }
    
}
