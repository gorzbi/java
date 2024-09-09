package Paczka01;

import java.util.Scanner;

public class Zadanie03 {
/*
* Napisać program, który oblicza wartość współczynnika BMI (ang. body mass
* index) wg. wzoru: waga/wzrost2. Jeżeli wynik jest w przedziale (18,5 - 24,9) to wypisuje
* ”waga prawidłowa”. Jeżeli poniżej to ”niedowaga”, jeżeli powyżej ”nadwaga”.
*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wagę");
        double waga = scan.nextDouble();
        System.out.println("Podaj wzrost");
        double wzrost = scan.nextDouble();

        double bmi = waga/(wzrost*wzrost);

        System.out.println("Twoje BMI to "+bmi);

        if (bmi >=18.5 && bmi <=24.9) {
            System.out.println("Waga prawidłowa");
        } else if (bmi < 18.5) {
            System.out.println("Niedowaga");
        } else {
            System.out.println("Nadwaga");
        }
    }
}
