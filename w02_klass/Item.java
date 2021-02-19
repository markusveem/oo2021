
public class Item {
  
    public static void main (String[]args){
        ItemClass item1 = new ItemClass();
        System.out.println( item1.damages +" "+ item1.damage + "  " + item1.defenses +" "+  item1.defense);

        ItemClass item2 = new ItemClass();
        item2.name = "shield";
        System.out.println(item2.name);
    
    }
}
