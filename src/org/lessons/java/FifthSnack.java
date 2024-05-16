package org.lessons.java;

import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

public class FifthSnack {
    /*
     *  Snack5
     *  Data una stringa in input mostrare a video quanti caratteri alfabetici contiene, quanti numeri e quanti simboli non alfanumerici.
     *  Continuare a chiedere una nuova stringa finchè non si inserisce 0.
     */

    public static void main(String[] args) {
        String word;
        int alphaChar = 0;
        int numbers = 0;
        int symbols = 0;

        boolean isWordValid = false;

        Scanner scanner = new Scanner(System.in);

        while (!isWordValid){
            System.out.println("Chose a word");
            word = scanner.nextLine();

            for (int i = 0; i < word.length() ; i++) {
                if (isLetter(word.charAt(i))){
                    alphaChar++;
                } else if (isDigit(word.charAt(i))) {
                    numbers++;
                }else {
                    symbols++;
                }
            }

            System.out.println("There are: " + alphaChar + " alphabetic chars in this word");
            System.out.println("There are: " + numbers + " numbers in this word");
            System.out.println("There are: " + symbols + " symbols in this word");

            alphaChar = 0;
            numbers = 0;
            symbols = 0;

            if (word.equals("0")) {
                isWordValid = true;
            }
        }

        scanner.close();
    }
}
