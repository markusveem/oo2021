/*Algarvud

* Teata, kas kasutaja sisestatud arv jagub kahe, kolme viie või seitsmega.
* Teata, kas kasutaja sisestatud arv on algarv. 
* Koosta massiiv esimese tuhande algarvuga. Leia selle sõela abil,
 millised on kümme suurimat algarvu, mis on väiksemad, kui tuhandenda algarvu ruut.*/


 //see lahendus on veel poolik

import java.util.Scanner; 


public class FirstTest {
    
    public static void main(String[] args) {
        divides();
        
    }

    public static void divides() {
        System.out.println("sisetage number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number % 2 ==0 ){
            System.out.println(number + " jagub 2ga");

        }
        else if (number % 3 ==0){
            System.out.println(number +" jagub 3ga");
        }
        else if (number % 5 ==0){
            System.out.println(number + "jagub 5ga");
        }

        else if (number % 7 ==0){
            System.out.println(number + "jagub 7ga");
        }else{
            System.out.println(number +" ei jagu 2;3;5 ega 7ga");
        }

        
    }
}
