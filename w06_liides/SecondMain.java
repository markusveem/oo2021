public class SecondMain {
    
    public static void main(String[] args) {

        blender();
        Fl();

    
        
    }

    public static void Fl() {

        String rating = "";
        Fl fl = new Fl(rating);
        System.out.println(fl.useful());
        System.out.println(fl.easy());
        System.out.println(fl.price());
        System.out.println(fl.fun());

    

        
    }

    public static void blender() {

        String rating = "";
        Blender blender = new Blender(rating);

        System.out.println(blender.useful());
        System.out.println(blender.easy());
        System.out.println(blender.price());
        System.out.println(blender.fun());
        
        
    }

}
