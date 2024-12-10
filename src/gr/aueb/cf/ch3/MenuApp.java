package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;

        do   {
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            System.out.println("Παρακαλώ εισάγετε έναν αριθμό από το 1 έως το 5.");
            num = scanner.nextInt();
            if (num == 1) {
                System.out.println("Επιλέξατε Εισαγωγή");
            } else if (num == 2) {
                System.out.println("Επιλέξατε Διαγραφή");
            } else if (num == 3) {
                System.out.println("Επιλέξατε Ενημέρωση");
            } else if (num == 4) {
                System.out.println("Επιλέξατε Αναζήτηση");
            } else if (num == 5) {
                System.out.println("Επιλέξατε Έξοδος");
            } else {
                System.out.println("Εισαγάγατε μη έγκυρο αριθμό.");
            }
        } while ( num > 0 && num < 5 );
    }
}



