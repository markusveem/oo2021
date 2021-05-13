public class Generic<T, U> {
    private T t;
    private U u;

    public void genreics(T t, U u) {
        this.t = t;
        this.u = u;
    }

    public T getT(){
        return t;
    } 

    public U getU(){
        return u;
    } 

}