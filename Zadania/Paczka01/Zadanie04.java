package Paczka01;

import java.util.Scanner;

public class Zadanie04 {
/*
* Napisać program obliczający należny podatek dochodowy od osób fizycznych.
* Program ma pobierać od użytkownika dochód i po obliczeniu wypisywać na ekranie
* należny podatek. Podatek obliczany jest wg. następujących reguł:
• do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
• od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,00
*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wynagrodzenie");
        double wynagrodzenie = scan.nextDouble();

        double podatek;

        if (wynagrodzenie<85528) {
            podatek=(wynagrodzenie*0.18)-556.02;
            System.out.println("Niższy podatek wynosi "+podatek+" zł");
        } else {
            podatek=14839.02+((wynagrodzenie-85528)*0.32);
            System.out.println("Wyższy podatek wynosi "+podatek+" zł");
        }
    }
}
