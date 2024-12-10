package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Υπολογίζει τους βαθμούς στην κλίμακα Κελσίου,
 * παίρνοντας από τον χρήστη βαθμούς Φαρενάιτ.
 */
public class CelciusApp {

    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int cel, far;


        System.out.println("Δώσε μου μια θερμοκρασία σε βαθμούς Φαρενάιτ.");
        far = in.nextInt();

        cel = 5 * (far-32) / 9;

        System.out.printf("Η θερμοκρασία σε βαθμούς Κελσίου είναι: %d", cel );


    }

}
