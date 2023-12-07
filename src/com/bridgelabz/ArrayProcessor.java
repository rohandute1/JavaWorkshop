package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class ArrayProcessor {
    private int[] originalArray;
    List<Integer> negativeArraylist = new ArrayList<>();
    List<Integer> positiveArraylist = new ArrayList<>();
    List<Integer> primeNumberList = new ArrayList<>();

    public ArrayProcessor(int[] originalArray){
        this.originalArray = originalArray;
    }
    public void positiveNegativeChecker(){
        for(int numPositive : originalArray){
            if (numPositive>= 0){
                positiveArraylist.add(numPositive);
            } else {
                negativeArraylist.add(numPositive);
            }
        }
        System.out.println(positiveArraylist);
        System.out.println(negativeArraylist);
    }
    public void primeNumberChecker() {
        for (int primeNumber : originalArray) {
            if (isPrime(primeNumber)) {
                primeNumberList.add(primeNumber);
            }
        }
        // printing positive prime numbers only
        System.out.println(primeNumberList);
    }

    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] inputArray = {11,222,31,445,7,45,295,-5,-8};
        ArrayProcessor arrayProcessor = new ArrayProcessor(inputArray);

        arrayProcessor.positiveNegativeChecker();
        arrayProcessor.primeNumberChecker();
    }
}