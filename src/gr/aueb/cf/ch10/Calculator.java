package gr.aueb.cf.ch10;

import java.nio.channels.ScatteringByteChannel;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        try {
            System.out.print("Please enter two integers"); // Εδώ έχουμε μνμ για τον χρήστη.
            // Data binding
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();

            result = add(num1, num2); // πραγματικές παράμετροι

            System.out.println("Sum: " + result);
        }catch (InputMismatchException e){ // Έχουμε exception στην main από το scanner
            System.out.println("Οι αριθμοί πρέπει να είναι ακέραιοι.");
        } catch (Exception e) { // Έχουμε exception από την μέθοδο
            System.out.println("Λάθος κατά τον υπολογισμό. Δεν μπορεί να γίνει διαίρεση με το μηδέν."); //Δίνουμε το μνμ στον χρήστη

        }





    }

    public static int add(int a, int b) { // εδώ έχουμε τυπικές παραμέτρους
        return a + b;

    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a,int b ) {
        return a * b;
    }

    public static int div(int a, int b) throws Exception {
        try {
            if (b == 0) throw new Exception("Error. Denominator must not be zero"); //Είναι απλά περιγραφή του exception
            return a / b;
        } catch (Exception e) {
            System.err.println("Error. " + e.getMessage());
            throw e;
        }
    }

    public static int mod(int a, int b) throws Exception {
        try {
            if (b == 0) throw new Exception("Error. Denominator must not be zero");
            return a % b;
        } catch (Exception e) {
            System.err.println("Error. " + e.getMessage());
            throw e;
        }
    }

}
