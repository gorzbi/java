package Paczka02;

import java.util.Scanner;

public class Zadanie03 {
/*
* Napisać program, który wczytuje od użytkownika liczbę całkowitą dodatnią n, a następnie
* wyświetla na ekranie wszystkie potęgi liczby 2 nie większe, niż podana liczba.
* Przykładowo, dla liczby 71 program powinien wyświetlić: 1 2 4 8 16 32 64
*/

    public static void main(String[] args) {

        double a;
        int i = 0;
        double potega=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę dodatnią");
        a = scan.nextInt();

        while (a<=0) {
            System.out.println("Liczba musi być dodatnia");
            a = scan.nextInt();
        }

        // TODO zlicza jedną niepotrzebną potęgę
        do {
            potega = Math.pow(2, i);
            i++;
            System.out.println("Kolejna potęgi 2 to " + potega);
        } while (potega <= a);
    }
}
