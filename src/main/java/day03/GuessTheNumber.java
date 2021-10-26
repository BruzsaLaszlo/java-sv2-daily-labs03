package day03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {


    public static void main(String[] args) {

        final int maxGuess = 6;
        final int randomNumber = new Random().nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < maxGuess; i++) {
            System.out.println(maxGuess - i + " lehetőséged van tippelni a számra: ");
            int guessed = scanner.nextInt();
            if (guessed == randomNumber) {
                System.out.println("Eltaláltad!!!");
                System.exit(0);
            } else {
                if (guessed > randomNumber) {
                    System.out.println("Kisebb!");
                } else {
                    System.out.println("Nagyobb!");
                }
            }
            scanner.nextLine();
        }
        System.out.println(randomNumber + " volt a szám!");

    }

}
