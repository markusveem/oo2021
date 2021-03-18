import javax.swing.Action;

public class Dog implements AnimalBehaviour {

    private String action;

    public Dog(String action){
        this.action = action;
    }


    @Override
    public String eat() {
        
        action = "look for food";
        return "new misson: "+ action;
    }

    @Override
    public String sleep() {
        action = "find a place to rest";
        return "you are feeling sleepy" + action;
    }

    @Override
    public String speak() {
        action ="woof woof";
        return action;
    }

    @Override
    public String beSneaky() {
        action = "movement set to sneaky";
        return action;
    }

    @Override
    public String lookAround() {
        action = "Look around";
        return action;
    }

    @Override
    public String attack() {
        action ="movement set to offensive";
        return action;
    }

    @Override
    public String defend() {
        action ="movement set to defensive";
        return action;
    }
    
}
