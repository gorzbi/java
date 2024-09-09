package Paczka01;

import java.util.Scanner;

public class Zadanie01 {
/*
* Napisać program służący do konwersji wartości temperatury podanej w stopniach
* Celcjusza na stopnie w skali Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie
* Celsjusza + 32.0)
*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj temp");
        double x = scan.nextDouble();

        double Fahrenheit = x * 1.8;
        System.out.println("Stopni Fahrenheit to jest "+Fahrenheit);
    }
}
