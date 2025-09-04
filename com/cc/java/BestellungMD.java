package com.cc.java;

import java.io.Console;

public class BestellungMD {
    public static void main(String[] args) {
        String food = "noch kein Burger gewählt";
        String drink = "noch kein Getränk gewählt";

        System.out.println(food);  
        System.out.println(drink); 



        Console console = System.console();
        if (console == null) {
            System.out.println("Konsole nicht verfügbar.");
            return;
        }

        System.out.println("Herzlich Willkommen bei MD, Ihre Bestellung bitte!");
        System.out.println("Hamburger (1), Cheeseburger (2), Chilliburger (3) oder Pommes (4) ?");

        String burgerInput = console.readLine();
        int burgerAuswahl = Integer.parseInt(burgerInput);

        switch (burgerAuswahl) {
            case 1:
                food = "Hamburger";
                break;
            case 2:
                food = "Cheeseburger";
                break;
            case 3:
                food = "Chilliburger";
                break;
            case 4:
                food = "Pommes";
                break;
            default:
                System.out.println("Ungültige Auswahl.");
                return;
        }

        System.out.println("Möchten Sie ein Getränk dazu bestellen? (j/n)");
        String getraenkWunsch = console.readLine();

        if (getraenkWunsch.equalsIgnoreCase("j")) {
            System.out.println("Cola (1), Fanta (2), Sprite (3)?");
            String drinkInput = console.readLine();
            int getraenkeAuswahl = Integer.parseInt(drinkInput);

            switch (getraenkeAuswahl) {
                case 1:
                    drink = "Cola";
                    break;
                case 2:
                    drink = "Fanta";
                    break;
                case 3:
                    drink = "Sprite";
                    break;
                default:
                    System.out.println("Ungültige Getränkeauswahl.");
                    return;
            }
            System.out.println("Hier ist Ihre Bestellung: " + food + " und " + drink);
        } else {
            System.out.println("Hier ist Ihre Bestellung: " + food);
        }
        System.out.println("Vielen Dank, und Auf Wiedersehen!");
    }
}
