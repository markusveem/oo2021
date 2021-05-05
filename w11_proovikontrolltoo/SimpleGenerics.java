public class SimpleGenerics <T> {
    private T type;

    public void set(T typeT){
        this.type = type;
    }
    
    public T get(){
        return this.type;
    }

    public String getType(){
        return this.type.getClass().getSimpleName();
    }
}
