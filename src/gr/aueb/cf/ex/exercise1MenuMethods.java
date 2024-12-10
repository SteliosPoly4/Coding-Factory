package gr.aueb.cf.ex;


import java.util.Scanner;

public class exercise1MenuMethods {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        int stars = 0;
        int result = 1;

        do {
            printMenu();

            choice = getChoice();
            stars = getStarsNumber();

            switch (choice) {
                case 1:

                    starsInRow(stars);
                    break;

            }


        } while (choice != 6);


    }

    public static void printMenu() {


        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 έως n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n έως 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");

    }

    public static int getChoice() {

        System.out.println("Δώσε μια επιλογή");
        return in.nextInt();
    }

    public static int getStarsNumber() {

        System.out.println("Δώστε αριθμό για αστεράκια");
        return in.nextInt();

    }

    public static void starsInRow(int a) {

        for (int i = 1; i <= a; i++) {
            System.out.print("*");

        }
        System.out.println();
    }


}