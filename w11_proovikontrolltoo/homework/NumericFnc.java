public class NumericFnc<T extends Number> {
    T num;
    

    NumericFnc(T ob){
        this.num = ob;

    }


    boolean absEqual(NumericFnc<?> ob){
        if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())){
        
            return true;
        }
        return false;
        
    }

    /*double square(){
        return num.intValue() * num.doubleValue();
    }*/
}
