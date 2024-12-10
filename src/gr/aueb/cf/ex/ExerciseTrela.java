package gr.aueb.cf.ex;

import java.util.Scanner;
/**
 * Ζητά από τον χρήστη να εισάγει έναν αριθμό.
 * Αν ο αριθμός είναι θετικός, να εκτυπώνει "Θετικός αριθμός" και να εμφανίζει τον αριθμό στον οποίο ανήκει (π.χ., μικρός, μεσαίος, μεγάλος) (π.χ., 1-10 είναι μικρός, 11-100 μεσαίος, 101 και άνω μεγάλος).
 * Αν ο αριθμός είναι αρνητικός, να εκτυπώνει "Αρνητικός αριθμός" και να υπολογίζει την απόλυτη τιμή του αριθμού.
 * Αν ο αριθμός είναι 0, να τερματίζει το πρόγραμμα και να εκτυπώνει "Το πρόγραμμα τερματίστηκε".
 * Το πρόγραμμα να συνεχίζει να ζητάει αριθμούς από τον χρήστη μέχρι να εισαχθεί το 0
 */

public class ExerciseTrela {
    public static void main(String[] args) {

    int num = 0;
    Scanner in = new Scanner(System.in);

    do {
        System.out.println("Δώσε μου έναν αριθμό.");
        num = in.nextInt();

        if ( num < 0 ) {
            System.out.println("Αρνητικός αριθμός.");
            System.out.println("Η απόλυτη τιμή του αριθμού είναι: " + (-num));

        } else if ( num > 0 ) {
            System.out.println("Θετικός αριθμός.");
            if ( num <=10 ) {
                System.out.println("μικρός");
            } else if ( num <=100 ) {
                System.out.println("μεσαίος");
            } else if ( num > 100 ) {
                System.out.println("μεγάλος");
            }
        }
    } while ( num !=0 );
        System.out.println("Το πρόγραμμα τερματίστηκε.");
    }
}
