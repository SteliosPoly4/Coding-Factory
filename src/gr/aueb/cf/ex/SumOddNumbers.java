package gr.aueb.cf.ex;

import java.util.Scanner;

/**
 * Γράψε ένα πρόγραμμα που να ζητά από τον χρήστη έναν ακέραιο αριθμό και να υπολογίζει το άθροισμα των αριθμών από το 1 έως τον αριθμό αυτόν, εξαιρώντας τους ζυγούς αριθμούς.
 */

public class SumOddNumbers {
    public static void main(String[] args) {
        // Δημιουργία αντικειμένου Scanner για είσοδο από τον χρήστη
        Scanner scanner = new Scanner(System.in);

        // Ζητάμε από τον χρήστη να εισάγει έναν ακέραιο αριθμό
        System.out.print("Εισάγετε έναν αριθμό: ");
        int num = scanner.nextInt();

        // Αρχικοποιούμε το άθροισμα σε 0
        int sum = 0;

        // Χρησιμοποιούμε την δομή επανάληψης for για να επαναλάβουμε από το 1 έως το n
        for (int i = 1; i <= num; i++) {
            // Ελέγχουμε αν ο αριθμός είναι περιττός (δηλαδή δεν είναι ζυγός)
            if (i % 2 != 0) {
                sum += i;  // Αν είναι περιττός, τον προσθέτουμε στο άθροισμα
            }
        }

        // Εμφανίζουμε το αποτέλεσμα
        System.out.println("Το άθροισμα των περιττών αριθμών από το 1 έως το " + num + " είναι: " + sum);

        // Κλείνουμε το Scanner για να αποφύγουμε διαρροές μνήμης
        scanner.close();
    }
}