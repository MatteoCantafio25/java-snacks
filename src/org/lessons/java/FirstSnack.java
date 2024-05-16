package org.lessons.java;

import java.util.Scanner;

public class FirstSnack {
    /*
    *  Snack1
    *  Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
    */

    public static void main(String[] args) {

        int userNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Chose a number");
        userNumber = Integer.parseInt(scanner.nextLine());

        if (userNumber % 2 == 0){
            System.out.println("Your number is even: " + userNumber);
        } else {
            System.out.println("Your number is odd: " + (userNumber + 1));
        }

        scanner.close();
    }
}
