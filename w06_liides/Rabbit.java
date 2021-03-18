public class Rabbit implements AnimalBehaviour {

    private String action;

    public Rabbit(String action){
        this.action = action;
    }

    @Override
    public String eat() {
        
        action = "Wait for hooman to bring food";
        return "new misson: "+ action;
    }

    @Override
    public String sleep() {
        action ="sleep";
        return action;
    }

    @Override
    public String speak() {
        action = "Happy rabbit noises";
        return action;
    }

    @Override
    public String beSneaky() {
        action ="im sneaky";
        return action;
    }

    @Override
    public String lookAround() {
        action = "make sure area is safe";
        return action;
    }

    @Override
    public String attack() {
        action = "If running doesnt help attack";
        return action;
    }

    @Override
    public String defend() {
        action = "RUN";
        return action;
    }
    
}
