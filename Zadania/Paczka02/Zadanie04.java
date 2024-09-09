package Paczka02;

import java.util.Scanner;

public class Zadanie04 {
/*
* Napisać program, który wczytuje liczby podawane przez użytkownika dotąd, dopóki
* nie podana zostanie liczba 0. Następnie wyświetlić sumę wszystkich podanych liczb.
*/

    public static void main(String[] args) {

        int a;
        int suma=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        a = scan.nextInt();

        while (a!=0) {
            suma=suma+a;
            System.out.println("Podaj kolejną liczbę");
            a = scan.nextInt();
        }
        System.out.println("Suma to "+suma);
    }
}
