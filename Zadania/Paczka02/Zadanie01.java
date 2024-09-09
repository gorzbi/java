package Paczka02;

import java.util.Scanner;

public class Zadanie01 {
/*
* Napisać program, który pobiera od użytkownika liczbę całkowitą dodatnią, a następnie
* wyświetla na ekranie kolejno wszystkie liczby niepatrzyste nie większe od podanej
* liczby. Przykład, dla 15 program powinien wyświetlić 1, 3, 5, 7, 9, 11, 13, 15.
*/

    public static void main(String[] args) {

        int a;

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą dodatnią");
        a = scan.nextInt();

        while (a<=0) {
            System.out.println("Liczba musi być dodatnia");
            a = scan.nextInt();
        }

        for (int i=1; i<=a; i=i+2) {
            System.out.println("Kolejna nieparzysta to "+i);
        }
    }
}
