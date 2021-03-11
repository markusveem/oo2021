/*Algarvud

* Teata, kas kasutaja sisestatud arv jagub kahe, kolme viie või seitsmega.
* Teata, kas kasutaja sisestatud arv on algarv. 
* Koosta massiiv esimese tuhande algarvuga. Leia selle sõela abil,
 millised on kümme suurimat algarvu, mis on väiksemad, kui tuhandenda algarvu ruut.*/


 // 3. ei saanud tööle

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner; 


public class FirstTest {
    
    public static void main(String[] args) {
        System.out.println("sisetage number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        primenum(num);
        divides(num);
        scan.close();
        primearray();
        
    }

    public static void divides(int num) {
       

        if ((num % 2 ==0) || (num % 3 ==0) || (num % 5 ==0) || (num % 7 ==0)){  
            if (num % 2 ==0 ){
                System.out.println(num + " jagub 2ga");
            }

            
            if (num % 3 ==0){
                System.out.println(num +" jagub 3ga");
            }
        

            if (num % 5 ==0){
                System.out.println(num + " jagub 5ga");
            
            }

            if (num % 7 ==0){
                System.out.println(num + " jagub 7ga");
            }
            
        }else{
            System.out.println(num +" ei jagu 2;3;5 ega 7ga");
        }

        
    }

   public static boolean primenum(int num) {
    

    
    boolean prime = true;               //++i = i=i+1
    for (int i = 2; i <= num / 2; ++i) { //numbrit ei saa jagada rohkem kui poolena (sellepärast num/2)
        if (num % i == 0) {             //i läheb iga kordsuuremaks kuni num/2 ni
            prime = false;
            break;
        }
    }

    if (prime){
        System.out.println(num + " on algarv");
    }else{
        System.out.println(num + " ei ole algarv");
    }
    return prime;

    }

    public static void primearray() {
        
        
        boolean primenum = false;
        HashSet<Integer> numbers = new HashSet<Integer>();



        for (int i = 2; i < 20; ++i ){

            for (int j = 1; j <= i/2; ++j) {
                if (i % j != 0) {
                    primenum = true;
                    numbers.add(i);

                    
               // if (primenum){
                //}
                
                }

                    
            }

        }
        System.out.println(numbers);
        
    }


        
       
}