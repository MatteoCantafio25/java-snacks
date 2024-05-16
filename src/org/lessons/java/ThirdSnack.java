package org.lessons.java;

public class ThirdSnack {
    /*
     *  Snack3
     *  Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
     */

    public static void main(String[] args) {
        int sum = 0;
        
        int[] numbers = {2, 3, 4, 6, 7, 10, 8};

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0){
                sum += numbers[i];
            }
        }

        System.out.println("Sum of odd numbers in the list is: "+ sum);
    }
}
