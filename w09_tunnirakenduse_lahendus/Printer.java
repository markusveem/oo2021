    /*Teha ka Threadi põhjal üks näide näiteks,
    kus samaaegselt käib 4 threadi,
    1 prindib numbreid 1st 10ni,
    teine thread 10st 1ni
    ja kolmas loeb tähti a-k (charcode 97 kuni 107)
    ja neljas k-a*/

public class Printer {


   public static void main(String[] args) {
       
    
    for (int i = 0; i <11; i++){

            try {
               /*new Thread(NumbersDesc(),String.valueOf(i)).start();
                new Thread(NumbersDesc(),String.valueOf(10-i)).start();
                new Thread(NumbersDesc(),Character.toString((char) (97+i))).start();
                new Thread(NumbersDesc(),Character.toString((char) (107-i))).start();*/
                System.out.println("---");
                Thread.sleep(2000); // kui peaks see ootama enne kui käivitub (sleep (millisekundites))
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }    
   }

   public static Runnable NumbersDesc(){
        return () -> {
            try {
                System.out.println(Thread.currentThread().getName());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        };
    }

    public static Runnable NumbersAsc(){
        return () -> {
            try {
                System.out.println(Thread.currentThread().getName());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        };
    }

    
}