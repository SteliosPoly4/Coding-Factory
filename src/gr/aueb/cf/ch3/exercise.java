package gr.aueb.cf.ch3;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=0;
        System.out.println("Give me a number (int)");
        num = in.nextInt();


        for ( int i=1 ; i <= num ; i++){
            System.out.print("*");


        }
        System.out.println();
        for ( int i = 1 ; i <= num ; i++){
            System.out.println("*");
        }
        for (int i = 1 ; i <= num ; i++){
            for (int j = 1 ; j <= num ; j++){
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = 1 ; i <= num ; i++){
            for ( int j = 1 ; j <= i ; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1 ; i <= num ; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
