public class ThreadExample {
    public static String[] names = {"Kati", "Mari", "Mati", "Ants", "Juku"};


    public static void main(String[] args) {
        for (int i = 0; i <5; i++){

            try {
                new Thread(getRunnable(),names[i]).start();
                Thread.sleep(500); // kui peaks see ootama enne kui käivitub (sleep (millisekundites))
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }    
    }

    public static Runnable getRunnable(){
        return () -> {
            for(int i = 0; i < 5; i++){
                try {
                    System.out.println(Thread.currentThread().getName()+" "+i);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        };
    }
}
