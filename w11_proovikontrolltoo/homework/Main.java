public class Main {
        public static void main(String[] args) {
           
            //Generics<Integer> iOb = new Generics<Integer>(4);
            //System.out.println(iOb.square());

            NumericFnc<Integer> iOb = new NumericFnc<Integer>(6);
            NumericFnc<Double> dOb = new NumericFnc<Double>(-6.0);

            System.out.println(iOb.absEqual(dOb));

        }
}