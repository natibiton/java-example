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

    //Using the "Two-Pointers technique", from the left and the right index - Assuming the array is sorted
    public boolean isSumExists(int [] numArray, int sum){
        int leftIndex = 0, rightIndex = numArray.length - 1;
        while (leftIndex < rightIndex){
            if(numArray[leftIndex] + numArray[rightIndex] == sum){
                return true;
            }
            else if(numArray[leftIndex] + numArray[rightIndex] > sum){
                rightIndex--;
            }
            else{
                leftIndex++;
            }
        }

        return false;
    }

}
