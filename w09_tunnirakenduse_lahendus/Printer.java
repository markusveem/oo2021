
/*Teha ka Threadi põhjal üks näide näiteks,
    kus samaaegselt käib 4 threadi,
    1 prindib numbreid 1st 10ni,
    teine thread 10st 1ni
    ja kolmas loeb tähti a-k (charcode 97 kuni 107)
    ja neljas k-a*/

public class Printer {


   public static void main(String[] args) {

    try {
        new Thread(NumbersDesc(),"").start();
        new Thread(NumbersAsc(),"").start();
        new Thread(CharAsc(),"").start();
        new Thread(CharDesc(),"").start();

        
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
          
    }
   public static Runnable NumbersDesc(){
        return () -> {
          try {
            for (int i =10; i > 0; i--){
                System.out.print(i + " ");
                Thread.sleep(1000);

            }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        };
    }

    public static Runnable NumbersAsc(){
        return () -> {
            try {
                for (int i = 1; i <11; i++){
                    System.out.print(i + " ");
                    Thread.sleep(1000);

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        };
    }
    

    public static Runnable CharAsc(){
        return () -> {
            try {
                for (int i =97; i <108; i++){
                    //int yourInt = 33;
                    char ch = (char) i;
                    System.out.print(ch + " ");
                    Thread.sleep(1000);


                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        };
    }
    public static Runnable CharDesc(){
        return () -> {
            try {
                for (int i = 107; i>96; i--){
                    char ch = (char) i;
                    System.out.println(ch+ " ");
                    Thread.sleep(1000);


                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        };
    }

    
}