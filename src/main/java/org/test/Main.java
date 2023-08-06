package org.test;

//Using the "Two-Pointers technique", from the left and the right index

public class Main {
    public static void main(String [] args){
        int[] items = new int[]{ 1,4,4,8,12 };
        System.out.println(isSumExists(11, items));
        System.out.println(isSumExists(11, items));

    }

    public static boolean isSumExists(int sum, int[] arr){
        int leftIndex = 0, rightIndex = arr.length - 1;

        while (leftIndex < rightIndex){
            if(arr[leftIndex] + arr[rightIndex] > sum){
                rightIndex--;
            }
            else if(arr[leftIndex] + arr[rightIndex] < sum){
                leftIndex++;
            }
            else{
                return true;
            }
        }

        return false;
    }
}
