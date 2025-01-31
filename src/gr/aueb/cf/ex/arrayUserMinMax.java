package gr.aueb.cf.ex;

import java.util.Scanner;

public class arrayUserMinMax {

    public static void main(String[] args) {

        int size = 0;



        try(Scanner in = new Scanner(System.in)) {

            System.out.println("Please give me the size of the table.");
            size = in.nextInt();
            int[] arr = new int[size];

            System.out.println("Insert "+ size + " numbers.");
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Item " + (i+1) +": ");
                arr[i] = in.nextInt();

            }

            int minValue = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < minValue) {
                    minValue = arr[i];
                }
            }
            System.out.println("The minimum value of the array is: " + minValue);

            int maxValue = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > maxValue) {
                    maxValue = arr[i];
                }
            }
            System.out.println("The maximum value of the array is: " + maxValue);
        } catch (Exception e) {
            System.out.println();


        }
    }
}
