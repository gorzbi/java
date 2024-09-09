package Paczka02;

import java.util.Scanner;

public class Zadanie09 {
/*
* Napisać program, który pobiera od użytkownika liczbę całkowitą, a następnie:
* oblicza sumę cyfr tej liczby,
* stosunek średniej arytmetycznej cyfr parzystych do średniej arytmetycznej cyfr nieparzystych.
*/

    public static void main(String[] args) {

        int x;
        int suma = 0;
        double sumaNieparz = 0;
        double srArtNieparz;
        double sumaParz = 0;
        double srArtParz;
        int iteracje;

        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź wartość");
        x = sc.nextInt();

        for (int i=0; i<=x; i++) {
            suma=suma+i;
        }
        System.out.println("Suma wszystkich to "+suma);

        for (int i=1; i<=x; i=i+2) {
            sumaNieparz=sumaNieparz+i;
        }
        iteracje = ((x-1)/2)+1;
        srArtNieparz = sumaNieparz/iteracje;
        System.out.println("Suma nieparzystych to "+sumaNieparz);
        System.out.println("Iteracji było "+iteracje);
        System.out.println("Średnia nieparzystych to "+srArtNieparz);

        for (int j=2; j<=x; j=j+2) {
            sumaParz=sumaParz+j;
        }
        iteracje = ((x-2)/2)+1;
        srArtParz = sumaParz/iteracje;
        System.out.println("Suma parzystych to "+sumaParz);
        System.out.println("Iteracji było "+iteracje);
        System.out.println("Średnia parzystych to "+srArtParz);
    }
}
