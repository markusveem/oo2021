import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Fridge> emptyFridgeLst = new ArrayList<Fridge>();
        Warehouse warehouse1 = new Warehouse(100, 5, emptyFridgeLst);
        Warehouse warehouse2 = new Warehouse(150, 6, emptyFridgeLst );

        Fridge lg = new Fridge("LG", 170, 50, 60, 70, true, 3);
        Fridge philips = new Fridge("Philips", 160, 60, 50, 70, false, 2);
        Fridge riga = new Fridge("Riga", 1160, 102, 53, 170, false, 2);


        warehouse1.addFridge(lg);
        warehouse1.addFridge(philips);
        warehouse1.addFridge(riga);


        for (Fridge fridge : warehouse1.getFridgeLst()) {
            System.out.println( "laos on külmik");
            System.out.println(fridge.getName());
            System.out.println("tema maht on");
            System.out.println(fridge.getCapacity()+" cm" );
          }

        
    }
}

    

    
        
    


