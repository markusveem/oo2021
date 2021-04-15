public class SecondMain {
    public static void main(String[] args) {
        House house = new House("House", "128");
        Trap trap = new Trap("trap", "140");
        house.GenreTempo();
        trap.GenreTempo();
        house.subgenres();
        System.out.println( trap.name +" genre age is approximately: "+trap.age+" years old");
      }
}
