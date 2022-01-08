package cku.sopot;

import java.util.Scanner;

public class TestyJednostkoweTrojkat {
    static float wysokosc;
    static float podstawa;
    static float pole;

    public static void main(String[] args) {
        Scanner buforKlawiatury = new Scanner(System.in);
        System.out.print("Podaj wysokość trójkąta: ");
        wysokosc = buforKlawiatury.nextFloat();
        System.out.print("Podaj podstawę trójkąta: ");
        podstawa = buforKlawiatury.nextFloat();

        Trojkat trojkat = new Trojkat(podstawa, wysokosc);
        pole = trojkat.obliczPole();

        System.out.print("Pole trójkąta o wysokości: " + wysokosc + " oraz o podstawie: " + podstawa);
        System.out.print(" wynosi: " + pole + ".");
    }
}
