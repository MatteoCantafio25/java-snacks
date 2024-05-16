package org.lessons.java;

import java.util.Scanner;

public class FourthSnack {
    /*
     *  Snack4
     *  Data in input una stringa verificare se è palindroma
     */

    public static void main(String[] args) {

        String word = "";
        String reversedWord = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Chose a word");
        word = scanner.nextLine().toLowerCase();

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        if (word.equals(reversedWord.toLowerCase())){
            System.out.println("The word you entered is palindrome");
        }else {
            System.out.println("The word you entered is not palindrome");
        }

        scanner.close();
    }
}
