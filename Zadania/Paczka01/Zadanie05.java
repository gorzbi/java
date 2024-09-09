package Paczka01;

import java.util.Scanner;

public class Zadanie05 {
/*
* W sklepie ze sprzętem AGD oferowana jest sprzedaż ratalna. Napisz program umożliwiający
*  wyliczenie wysokości miesięcznej raty za zakupiony sprzęt. Danymi wejściowymi dla programu są:
• cena towaru (od 100 zł do 10 tyś. zł),
• liczba rat (od 6 do 48).
* Kredyt jest oprocentowany w zależności od liczby rat:
• od 6–12 wynosi 2.5% ,
• od 13–24 wynosi 5%,
• od 25–48 wynosi 10%.
* Obliczona miesięczna rata powinna zawierać również odsetki. Program powinien
* sprawdzać, czy podane dane mieszczą się w określonych powyżej zakresach, a w
* przypadku błędu prosić użytkownika ponownie o podanie danych.
*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj cenę");
        double cena = scan.nextDouble();
        while (cena < 100 || cena > 10000) {
            System.out.println("Cena musi być w przedziale 100-10k. Podaj cenę");
            cena = scan.nextDouble();
        }

        System.out.println("Podaj ilość rat");
        int raty = scan.nextInt();
        while (raty < 6 || raty > 48) {
            System.out.println("Ilość rat to przedział 6-48. Podaj ilość rat");
            raty = scan.nextInt();
        }

        double odsetki;
        double miesiecznaRata = cena/raty;
        double miesiecznaPlatnosc;

        if (raty >=6 && raty <= 12) {
            odsetki = miesiecznaRata*0.025;
            miesiecznaPlatnosc = raty + odsetki;
            System.out.println("Rata wynosi "+miesiecznaRata);
            System.out.println("Odsetki 2,5% wynoszą "+odsetki);
            System.out.println("Do zapłaty za 1 m/c jest "+miesiecznaPlatnosc);
        } else if (raty >=13 && raty <= 24) {
            odsetki = miesiecznaRata*0.05;
            miesiecznaPlatnosc = raty + odsetki;
            System.out.println("Rata wynosi "+miesiecznaRata);
            System.out.println("Odsetki 5% wynoszą "+odsetki);
            System.out.println("Do zapłaty za 1 m/c jest "+miesiecznaPlatnosc);
        } else {
            odsetki = miesiecznaRata*0.1;
            miesiecznaPlatnosc = raty + odsetki;
            System.out.println("Rata wynosi "+miesiecznaRata);
            System.out.println("Odsetki 10% wynoszą "+odsetki);
            System.out.println("Do zapłaty za 1m/c jest "+miesiecznaPlatnosc);
        }
    }
}
