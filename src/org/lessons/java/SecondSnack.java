package org.lessons.java;
import java.util.Random;

public class SecondSnack {
    /*
     *  Snack2
     *  Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi,
     *  e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
     */

    public static void main(String[] args) {
        String[] guestsName = {"Fabrizio", "Pippo", "Daniele", "Claudio", "Francesco", "Luca", "Maurizio", "Emiliano"};
        String[] guestsSurname = {"Esposito", "Lancellotti", "Ercoli", "Maniscalco", "Pasquinoni", "Padurariu", "Rossi", "Gastaldo"};

        Random random = new Random();
        String guest;


        for (int i = 0; i < guestsName.length; i++) {
            int randomName = random.nextInt(guestsName.length);
            int randomSurname = random.nextInt(guestsSurname.length);

            guest = guestsName[randomName] + " " + guestsSurname[randomSurname];
            System.out.println(guest);
        }

    }
}
