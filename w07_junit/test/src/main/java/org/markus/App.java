package org.markus;

/**
 * Hello world!
 *
 */
public class App {

    public String name;

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public String getName(){
        return name;
    }

    public int sum(int a, int b){
        return a + b ;
    }
    //varargs
    public int[] toArray(int ...args){
        int lenght = args.length;
        int[] arr = new int[lenght];

        for (int i =0; i < lenght; i++){
            arr[i] = args[i];
        }

        return arr;
    }
}
