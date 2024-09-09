package Paczka01;

import java.util.Scanner;

public class Zadanie06 {
/*
* Napisać program realizujący funkcje prostego kalkulatora, pozwalającego na wykonywanie
* operacji dodawania, odejmowania, mnożenia i dzielenia na dwóch liczbach rzeczywistych.
* Program ma identyfikować sytuację wprowadzenia błędnego symbolu działania oraz próbę
* dzielenia przez zero. Zastosować instrukcję switch do wykonania odpowiedniego działania
* w zależności od wprowadzonego symbolu operacji. Scenariusz działania programu:
* a) Program wyświetla informację o swoim przeznaczeniu.
* b) Wczytuje pierwszą liczbę.
* c) Wczytuje symbol operacji arytmetycznej: +, -, *, /.
* d) Wczytuje drugą liczbę.
* e) Wyświetla wynik lub w razie konieczności informację o niemożności wykonania działania.
* f) Program kończy swoje działanie po naciśnięciu przez użytkownika klawisza Enter.
*/

    public static void main(String[] args) {

        double a;
        double b;
        String symbol;

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        a = scan.nextDouble();

        System.out.println("Podaj symbol operacji: +,-,/,*");
        symbol = scan.nextLine();
        while (!symbol.equals("+") && !symbol.equals("-") && !symbol.equals("/") && !symbol.equals("*")) {
            System.out.println("Operacje możliwe do wykonania to : +,-,/,*");
            symbol = scan.nextLine();
        }

        System.out.println("Podaj drugą liczbę");
        b = scan.nextDouble();

        if (b == 0 && symbol.equals("/")) {
            System.out.println("Nie można dzielić przez 0");
        }

        double wynik;

        switch (symbol) {
            case "+":
                wynik = a + b;
                System.out.println("Wynik dodawania to "+wynik);
                break;

            case "-":
                wynik = a - b;
                System.out.println("Wynik odejmowania to "+wynik);
                break;

            case "/":
                wynik = a / b;
                System.out.println("Wynik dzielenia to "+wynik);
                break;

            case "*":
                wynik = a * b;
                System.out.println("Wynik mnożenia to "+wynik);
                break;

            default:
                System.out.println("Nie można wykonać operacji");
        }
    }
}
