package gr.aueb.cf.ex;

import java.util.Scanner;

/**
 * Γράψε ένα πρόγραμμα που να ζητά από τον χρήστη να εισάγει έναν αριθμό.
 * Το πρόγραμμα πρέπει να συνεχίζει να ζητάει αριθμούς μέχρι ο χρήστης να εισάγει το 0. Αν ο αριθμός είναι αρνητικός, να εκτυπώνει το μήνυμα "Αρνητικός αριθμός".
 */

public class NumAsking {
    public static void main(String[] args) {

        int num = 0;
        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.println("Δώσε μου έναν αριθμό");
            num = in.nextInt();
            if (num == 0){
                break;
            }
            if ( num < 0 ) {

                System.out.println("Ο αριθμός είναι αρνητικός");
            }
        }
    }
}
