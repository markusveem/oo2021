public class StringMethod {
    public static void main(String[] args) {
        
        //FIRST, LAST, SUBSTRING, LOWER-UPPER CASE

        String name = "Markus Martin";
        System.out.println("name: " +name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println("First char:" + name.charAt(0));
        System.out.println("Lenght: " + name.length());
        System.out.println("lasr char: " + name.charAt(12));
        System.out.println("substring: " + name.substring(6, 13));



        //EQUALS

        String a = new String("Praanik");
        String b = new String("Praanik");
        //String a = "Praanik";
        //String b = "Praanik";

        if (a==b){
            System.out.println("==" + "true");
        }else{
            System.out.println("== false");
        }

        if (a/*.toLowerCase()*/.equals(b)){
            System.out.println("equals True");
        }else{
            System.out.println("equals False");
        }


        String pooliks = "tee see tekst pooleks";
        String parts[] = pooliks.split(" ");

        for (int i=0; i<parts.length; i++){
            System.out.println("-->" + parts[i]);
        }
    }
    
    
}
