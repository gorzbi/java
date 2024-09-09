package Paczka02;

import java.util.Scanner;

public class Zadanie02 {
/*
* Napisać program pobierający od użytkownika dwie liczby całkowite A oraz B,
* A < B, a następnie wyznaczający sumę ciągu liczb od A do B, czyli sumę ciągu
* (A, A + 1, . . . , B). Obliczenia należy wykonać trzykrotnie stosując kolejno pętle:
* while, do-while, for.
* Przykład: Dla A = 4 i B = 11 program powinien wyświetlić: 60 / 60 / 60
*/

    public static void main(String[] args) {

        int a;
        int b;
        int suma=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        a = scan.nextInt();
        System.out.println("Podaj drugą liczbę");
        b = scan.nextInt();

        while (b<=a) {
            System.out.println("Druga liczba musi być większa od pierwszej");
            b = scan.nextInt();
        }

        for (int i=a;i<=b;i++) {
            suma=suma+i;
        }
        System.out.println("Suma elementów to "+suma);
    }
}
