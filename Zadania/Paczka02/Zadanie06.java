package Paczka02;

import java.util.Scanner;

public class Zadanie06 {
/*
* Gra w ”Za dużo, za mało”. Komputer losuje liczbę z zakresu 1 . . . 100, a gracz
* (użytkownik) ma za zadanie odgadnąć, co to za liczba poprzez podawanie kolejnych wartości.
* Jeżeli podana wartość jest:
• większa – wyświetlany jest komunikat „Podałeś za dużą wartość”,
• mniejsza – wyświetlany jest komunikat „Podałeś za małą wartość”,
• identyczna z wylosowaną – wyświetlany jest komunikat „Gratulacje” i gra się kończy.
*/

    public static void main(String[] args) {

        int x;
        int min = 1;
        int max = 100;
        int los = (int)(Math.random()*(max-min+1)+min);
        System.out.println("Wylosowana liczba to "+los);

        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź wartość");
        x = sc.nextInt();

        while (x < los) {
            System.out.println("Za mało, wprowadź wartość");
            x = sc.nextInt();
        }
        while (x > los) {
            System.out.println("Za dużo, wprowadź wartość");
            x = sc.nextInt();
        }
        if (x==los) {
            System.out.println("Trafione gratki !!");
        }
    }
}
