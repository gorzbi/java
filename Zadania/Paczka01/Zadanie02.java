package Paczka01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Zadanie02 {
/*
* Wczytać od użytkownika 3 liczby całkowite i wypisać na ekran największą oraz
* najmniejszą z nich.
*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int x = scan.nextInt();
        System.out.println("Podaj drugą liczbę");
        int y = scan.nextInt();
        System.out.println("Podaj trzecią liczbę");
        int z = scan.nextInt();

        // 1 sposób
        // stworzenie tablicy z liczb
        Integer[] tablica = {x,y,z};

        // drukowanie pełnej tablicy
        System.out.println(Arrays.toString(tablica));

        // wartość min
        int min = Collections.min(Arrays.asList(tablica)); // tablica musi być Integer a nie int
        System.out.println("Minimum to "+min);

        // wartość max
        int max = Collections.max(Arrays.asList(tablica)); // tablica musi być Integer a nie int
        System.out.println("Maximum to "+max);

        // 2 sposób
        int[] tab = {4,1,8,7};
        int mini = Arrays.stream(tab)
                .min()
                .getAsInt();
        int maxi = Arrays.stream(tab)
                .max()
                .getAsInt();
        System.out.println("Minimum z drugiej to "+mini);
        System.out.println("Maksimum z drugiej to "+maxi);
    }
}
