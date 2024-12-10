package gr.aueb.cf.ex;

import java.rmi.ServerError;
import java.util.Scanner;

public class ReverseWord {

    public static void main(String[] args) {
        String w;
        System.out.println("Δώσε μου μια λέξη.");
        try (Scanner scanner = new Scanner(System.in)) {
            w = scanner.nextLine();
            validate(w);
            reverseString(w);

        }catch (IllegalArgumentException e) {
            System.out.println("Παρακαλώ δώσε λέξεις και όχι αριθμούς!!!!");
        }

    }

    public static void reverseString (String a ) throws IllegalArgumentException {
         try {
             //if (a.matches(".*\\d.*"))  {

                 for (int i = a.length() - 1; i >= 0; i--) {
                     System.out.print(a.charAt(i));
                 }
             //}
        } catch (IllegalArgumentException e) {
             System.err.println(e.getMessage());
            throw e;

       }
    }

    public static void validate (String b) {

        try {
            if (b.matches(".*\\d.*")) throw new IllegalArgumentException("Παρακαλώ δώσε λέξεις και όχι αριθμούς!");
               // System.out.println("Παρακαλώ δώσε λέξεις και όχι αριθμούς!");


        }catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }


}
