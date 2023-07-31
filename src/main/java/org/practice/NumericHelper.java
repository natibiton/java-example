package org.practice;

public class NumericHelper {
    private static NumericHelper numericHelperInstance = new NumericHelper();
    private NumericHelper(){}

    public static NumericHelper getNumericHelperInstance(){
        return numericHelperInstance;
    }

    //a whole number greater than 1 whose only factors are 1 and itself
    public boolean isPrime(int input){
        if(input == 0 || input ==  1){
            return Boolean.FALSE;
        }
        for(int i=2; i < input; i++){
            if( input % i == 0){
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

}
